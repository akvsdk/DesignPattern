package com.ling.Adapter;

import com.ling.Adapter.player.CHN_player;
import com.ling.Adapter.player.NBA_player;
import com.ling.Adapter.player.Native_Player;

/*=================客户端====================*/
public class postive {
    public static void main(String[] args) {
        CHN_player yaoming = new CHN_player("yaoming");
        System.out.println(yaoming.getName());
        yaoming.Speak_Foreign_Language();

        //进行适配
        Native_Player translator =  new Adapter_Translator(yaoming);
        System.out.println(translator.getName());
        translator.speak_English();
    }
}
