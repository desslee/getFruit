/**   
* @Title: MyViewPagerAdapter.java
* @Package com.get.fruit.adapter 
* @Description: TODO
* @author LiQinglin 
* @date 2015-8-14 ����10:05:26 
* @version V1.0   
*//*
package com.get.fruit.adapter;

*//** 
 * @ClassName: MyViewPagerAdapter 
 * @Description: TODO
 * @author LiQinglin
 * @date 2015-8-14 ����10:05:26 
 *  
 *//*
public class MyViewPagerAdapter {

	//�̳�PagerAdapter����Ҫ��д���������


	public int getCount() {
		return pages.size();
	}
	//����page�ĳ���




	public boolean isViewFromObject(View arg0, Object arg1) {
	return arg0==arg1;
	}
	//�ж�instantiateItem(ViewGroup container, int position)���ص�Ҫ���ص�pager�����ǲ���view��ͼ�����򷵻�true����ʾ�����Ƿ���false����ʾ��




	public CharSequence getPageTitle(int position) {
	return super.getPageTitle(position);
	}
	//��ȡ��Ӧposition��tab����Ҫ��ʾ�����֡�




	public void destroyItem(ViewGroup container, int position, Object object) {
	container.removeView(pages.get(position));
	}
	���ٶ���3����pager����
	container vp����
	position vp������±�






	public Object instantiateItem(ViewGroup container, int position) {
	container.addView(pages.get(position));
	return pages.get(position);
	}
	װ��pager�ķ�����/container������װ��page��ViewPager����
	position��װ������и�ÿ��pager���±�
	���صĶ�����ǵ�ǰ����ȥ��pager����










	//ViewPager�ĵ���¼�������
	setOnPageChangeListener();


	public void onPageScrollStateChanged(int arg0) {}
	//ҳ�滬��״̬�ı��ʱ�򱻵��ã�arg0���ǵ�ǰ��ʾpager��position


	public void onPageScrolled(int arg0, float arg1, int arg2) {}
	//ҳ�滬��������ʱ����á�arg0Ϊ��ǰ��ʾ��pager��position��arg1�ǻ����ٷֱȣ�arg2�ǻ����Ժ��position


	public void onPageSelected(int arg0) {}
	//��������Ժ���¼�������arg0Ϊ�����Ժ��position
}
*/