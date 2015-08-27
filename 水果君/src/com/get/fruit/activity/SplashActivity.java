package com.get.fruit.activity;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import cn.bmob.im.BmobChat;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindCallback;
import cn.bmob.v3.listener.FindListener;

import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;
import com.baidu.mapapi.SDKInitializer;
import com.get.fruit.App;
import com.get.fruit.Config;
import com.get.fruit.R;
import com.get.fruit.bean.FruitShop;

/**
 * ����ҳ
 * 
 * @ClassName: SplashActivity
 * @Description: TODO
 * @author smile
 * @date 2014-6-4 ����9:45:43
 */
public class SplashActivity extends BaseActivity {

	private static final int GO_HOME = 100;
	private static final int GO_LOGIN = 200;

	// ��λ��ȡ��ǰ�û��ĵ���λ��
	private LocationClient mLocationClient;

	private BaiduReceiver mReceiver;// ע��㲥�����������ڼ��������Լ���֤key

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ShowLog("oncreate");
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		if (!isNetConnected()) {
			ShowToast("��ǰ�o�W�j�B�ӣ�");
		}
		BmobChat.getInstance(this).init(Config.applicationId);
		if (userManager.getCurrentUser() != null) {
			ShowLog("query...");
			BmobQuery<FruitShop> query=new BmobQuery<FruitShop>();
			query.addWhereEqualTo("owner",userManager.getCurrentUser());
			query.findObjects(mApplication, new FindListener<FruitShop>() {
				
				@Override
				public void onSuccess(List<FruitShop> arg0) {
					// TODO Auto-generated method stub
					if (arg0.size()==0) {
						ShowLog("init shop null");
						return;
					}
					App.setMyshop(arg0.get(0));
					ShowLog("init shop successed");
				}
				
				@Override
				public void onError(int arg0, String arg1) {
					// TODO Auto-generated method stub
					ShowLog("init shop fail");
				}
			});
			// ������λ
			initLocClient();
			 //ע���ͼ SDK �㲥������
			IntentFilter iFilter = new IntentFilter();
			iFilter.addAction(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR);
			iFilter.addAction(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR);
			mReceiver = new BaiduReceiver();
			registerReceiver(mReceiver, iFilter);
			ShowLog("register");

			
			//updateUserInfos();
			mHandler.sendEmptyMessageDelayed(GO_HOME, 1000);
		} else {
			mHandler.sendEmptyMessageDelayed(GO_LOGIN, 1000);
		}
		
	}

	/**
	 * ������λ�����µ�ǰ�û��ľ�γ������
	 * @Title: initLocClient
	 * @Description: TODO
	 * @param
	 * @return void
	 * @throws
	 */
	private void initLocClient() {
		mLocationClient = App.getInstance().mLocationClient;
		LocationClientOption option = new LocationClientOption();
		option.setLocationMode(LocationMode.Hight_Accuracy);// ���ö�λģʽ:�߾���ģʽ
		option.setCoorType("bd09ll"); // ������������:�ٶȾ�γ��
		option.setScanSpan(1000);// ���÷���λ����ļ��ʱ��Ϊ1000ms:����1000Ϊ�ֶ���λһ�Σ����ڻ����1000��Ϊ��ʱ��λ
		option.setIsNeedAddress(false);// ����Ҫ������ַ��Ϣ
		mLocationClient.setLocOption(option);
		mLocationClient.start();
	}

	@SuppressLint("HandlerLeak")
	private Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case GO_HOME:
				startAnimActivity(AddFruitActivity.class);//test
				/*
				startAnimActivity(MainActivity.class);
				 */
				finish();
				break;
			case GO_LOGIN:
				startAnimActivity(LoginActivity.class);
				/*
				startAnimActivity(AddFruitActivity.class);//test
				 */
				finish();
				break;
			}
		}
	};

	/**
	 * ����㲥�����࣬���� SDK key ��֤�Լ������쳣�㲥
	 */
	public class BaiduReceiver extends BroadcastReceiver {
		public void onReceive(Context context, Intent intent) {
			String s = intent.getAction();
			if (s.equals(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR)) {
				ShowToast("key ��֤����! ���� AndroidManifest.xml �ļ��м�� key ����");
			} else if (s
					.equals(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR)) {
				ShowToast("��ǰ�������Ӳ��ȶ�������������������!");
			}
		}
	}

	@Override
	protected void onDestroy() {
		// �˳�ʱ���ٶ�λ
		stopLocation();
	}

	public void stopLocation() {
		if (mLocationClient != null && mLocationClient.isStarted()) {
			mLocationClient.stop();
		}
		try {
			unregisterReceiver(mReceiver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		super.onDestroy();
	}

}
