package com.bootdo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.bootdo.*.dao")
@SpringBootApplication
@EnableCaching
public class BootdoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootdoApplication.class, args);
//        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    bootdo启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
//                " ______                    _   ______            \n" +
//                "|_   _ \\                  / |_|_   _ `.          \n" +
//                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
//                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
//                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
//                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");

        System.out.println("启动成功.\n" +
                "                                                            __----~~~~~~~~~~~------___\n" +
                "                                           .  .   ~~//====......          __--~ ~~\n" +
                "                           -.            \\_|//     |||\\\\  ~~~~~~::::... /~\n" +
                "                        ___-==_       _-~o~  \\/    |||  \\\\            _/~~-\n" +
                "                __---~~~.==~||\\=_    -_--~/_-~|-   |\\\\   \\\\        _/~\n" +
                "            _-~~     .=~    |  \\\\-_    '-~7  /-   /  ||    \\      /\n" +
                "          .~       .~       |   \\\\ -_    /  /-   /   ||      \\   /\n" +
                "         /  ____  /         |     \\\\ ~-_/  /|- _/   .||       \\ /\n" +
                "         |~~    ~~|--~~~~--_ \\     ~==-/   | \\~--===~~        .\\\n" +
                "                  '         ~-|      /|    |-~\\~~       __--~~\n" +
                "                              |-~~-_/ |    |   ~\\_   _-~            /\\\n" +
                "                                   /  \\     \\__   \\/~                \\__\n" +
                "                               _--~ _/ | .-~~____--~-/                  ~~==.\n" +
                "                              ((->/~   '.|||' -_|    ~~-/ ,              . _||\n" +
                "                                         -_     ~\\      ~~---l__i__i__i--~~_/\n" +
                "                                         _-~-__   ~)  \\--______________--~~\n" +
                "                                       .-~~~-~_--~- |-------~~~~~~~~\n" +
                "                                              .-~~~--\\");


        ////////////////////////////////////////////////////////////////////
        //                          _ooOoo_                               //
        //                         o8888888o                              //
        //                         88" . "88                              //
        //                         (| ^_^ |)                              //
        //                         O\  =  /O                              //
        //                      ____/`---'\____                           //
        //                    .'  \\|     |//  `.                         //
        //                   /  \\|||  :  |||//  \                        //
        //                  /  _||||| -:- |||||-  \                       //
        //                  |   | \\\  -  /// |   |                       //
        //                  | \_|  ''\---/''  |   |                       //
        //                  \  .-\__  `-`  ___/-. /                       //
        //                ___`. .'  /--.--\  `. . ___                     //
        //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
        //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
        //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
        //      ========`-.____`-.___\_____/___.-`____.-'========         //
        //                           `=---='                              //
        //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
        //             佛祖保佑          永无BUG         永不修改                	  //

    }
}
