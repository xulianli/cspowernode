package com.cspowernode.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/30 15:13
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("小苹果","筷子兄弟"));
        songList.add(new Song("你把我灌醉","邓紫棋"));
        songList.add(new Song("加州旅馆","Eagles"));
        songList.add(new Song("すずめ","十明"));
        System.out.println("------------欢迎使用动力节点模拟音乐播放器------------");
        boolean flag = true;
        while (flag){
            System.out.println("1.查看列表,2.添加歌曲,3.删除歌曲,4.清空列表," +
                    "5.播放歌曲,6.停止播放,7.查找歌手,8.退出");
            switch (sc.next()){
                case "1":
                    showSongList(songList);
                    break;
                case "2":
                    addSong(songList);
                    break;
                case "3":
                    deleteSong(songList);
                    break;
                case "4":
                    clearAll(songList);
                    break;
                case "5":
                    playSong();
                    break;
                case "6":
                    Music.stop();
                    break;
                case "7":
                    find(songList);
                    break;
                case "8":
                    System.out.println("欢迎下次再来哦~");
                    flag = false;
                    return;
                default:
                    System.out.println("指令无法识别，请重新输入");
                    break;
            }
        }
    }

    private static void find(List<Song> songList) {
        System.out.println("请输入你要查找的歌手名:");
        Scanner sc3 = new Scanner(System.in);
        String singer3 = sc3.next();
        for (Song song : songList) {
            if(singer3.equals(song.singer)) {
                System.out.println(song);
            }
        }
    }

    private static void playSong() {
        System.out.println("请输入你要播放的歌曲名和歌手名，空格隔开:");
        Song playSong = parseSong();
        Music.play(playSong.toString());
    }

    private static void clearAll(List<Song> songList) {
        System.out.println("你确定要把歌曲列表都清空吗?y/n:");
        Scanner answer = new Scanner(System.in);
        if ("y".equals(answer.next())) {
            songList.clear();
            System.out.println("清空完成");
        }
    }

    private static void deleteSong(List<Song> songList) {
        System.out.println("请输入你要删除的歌曲名和歌手名，空格隔开:");
        Song deleteSong = parseSong();
        if (songList.contains(deleteSong)){
            songList.remove(deleteSong);
            System.out.println("删除成功！");
        }
    }

    private static void addSong(List<Song> songList) {
        System.out.println("请输入你要添加的歌曲名和歌手名，空格隔开:");
        Scanner input = new Scanner(System.in);
        String [] info = input.nextLine().split(" ");
        String name = info[0];
        String singer = info[1];
        Song addSong = new Song(name, singer);
        if (songList.contains(addSong)){
            System.out.println("歌曲列表中已经有该歌曲了，是否仍然要添加?y/n");
            if ("y".equals(input.next())){
                songList.add(addSong);
                System.out.println("歌曲添加成功！");
            }
        }
        songList.add(addSong);
        System.out.println("歌曲添加成功！");

    }

    private static void showSongList(List<Song> songList) {
        System.out.println(songList.isEmpty()?"列表为空":songList);
    }

    private static Song parseSong(){
        Scanner input = new Scanner(System.in);
        String [] info = input.nextLine().split(" ");
        String name = info[0];
        String singer = info[1];
        return new Song(name, singer);
    }
}
