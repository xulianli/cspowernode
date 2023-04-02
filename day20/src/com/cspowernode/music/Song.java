package com.cspowernode.music;

import java.util.Objects;

/**
 * @Author 徐联理
 * @Date 2023/3/30 15:11
 * @Description
 */
public class Song {
    String name;
    String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return singer + "-" + name ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Song song = (Song) o;
        return Objects.equals(name, song.name) && Objects.equals(singer, song.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, singer);
    }
}
