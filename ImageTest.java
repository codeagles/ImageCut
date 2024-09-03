/**
 * 
 */
package com.codeagles.util;

import java.io.IOException;

/**
 * @author hcn
 *
 */
public class ImageTest {
	public static void main(String[] args){
		try {
			if(ImageCutUtil.splitImage("D://image/1.jpg")){
				System.out.println("完成分割");
				int i = 1/0;
			}else{
				System.out.println("不需要分割");
				int i = (int)null;
			}
			
//			ImageCutUtil.mergeImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
