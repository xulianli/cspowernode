package com.cspowernode.music;

import java.io.File;
import java.io.IOException;
import java.net.*;

import javax.media.*;

public class Music{
	// 播放器对象
	public static Player player;
	//媒体文件URL地址
	public static URL fileURL;
	//本地放歌曲的目录
	public static String local;

	/**
	 * 播放歌曲
	 * @param musicName	歌曲名，只能播放wav格式
	 */
	public static void play(String musicName){
		local = "C:\\music\\"+musicName+".wav";
		File file = new File(local);
		try {
			fileURL = file.toURL();
			MediaLocator mediaLocator = new MediaLocator(fileURL); //媒体定位器
			player = Manager.createPlayer(mediaLocator); //得到播放器实例
			player.start();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NoPlayerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 停止当前播放的歌曲
	 */
	public static void stop(){
		if(player != null) {
			player.stop();
		}
//		 System.exit(0);
	}

	public static void main(String[] args) {
		String music = "邓紫棋-你把我灌醉";
		Music.play(music);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Music.stop();
	}
}  

