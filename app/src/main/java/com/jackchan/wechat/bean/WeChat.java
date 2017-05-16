package com.jackchan.wechat.bean;

import java.util.List;

/**
 * ============================================================
 * Copyright：JackChan和他的朋友们有限公司版权所有 (c) 2017
 * Author：   JackChan
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChan1999
 * GitBook：  https://www.gitbook.com/@alleniverson
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：WeChatDemo
 * Package_Name：com.jackchan.wechat
 * Version：1.0
 * time：2017/5/16 12:39
 * des ：微信朋友圈，QQ空间，微博等列表展示的功能实现
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/5/16 12:39
 * updateDes：${TODO}
 * ============================================================
 */
public class WeChat {

    /**
     * result : true
     * weibo : [{"avatar":"avatar_01","comment":5,
     * "content":"我装作看不懂的样子[呲牙][偷笑][偷笑]，单身狗保重 [再见][再见] @冷笑话精选","date":1489223423501,
     * "forward":8,"imageUrls":["pic_1","pic_2","pic_3","pic_4","pic_5","pic_6",
     * "pic_7","pic_8","pic_9"],"like":10,
     * "user_introduction":"最冷笑话精选，每天分享笑话N枚，你的贴身开心果。","username":"冷笑话精选"},
     * {"avatar":"avatar_01","comment":5,"content":"我装作看不懂的样子话题 #编程# #黑马程序员# 用户 @冷笑话精选
     * ","date":1489223423501,"forward":8,"like":10,
     * "user_introduction":"最冷笑话精选，每天分享笑话N枚，你的贴身开心果。","username":"冷笑话精选"},
     * {"avatar":"avatar_02","comment":5,"content":"#讲故事# 今天看见一个老人摔倒，于是就过去扶，
     * 没想到他一把抓住我的手，我急忙说:监控会还我清白！ 老人说:嘿嘿别傻了这里没监控！ 我直接一脚踹过去。TMD没监控也敢这么吊。
     * 他儿子及时出现说，我们在边上录下你踹人的视频。 我冷笑一声出示了南京人民医院提供的急性短暂性精神障碍证明。","date":1489223423501,
     * "forward":8,"imageUrls":[],"like":10,"user_introduction":"","username":"作家崔成浩"},
     * {"avatar":"avatar_03","comment":5,"content":"#心理学# 我曾在四十度的高温下扬言， 我宁可冻死也不愿热成狗
     * ，直到今天我被冻成狗 ，我才明白太美的承诺因为太年轻。。。","date":1489223423501,"forward":8,
     * "imageUrls":["pic_small_101"],"like":10,"username":"犯罪心理学"},
     * {"avatar":"avatar_02","comment":5,
     * "content":"在北京大阅兵之际，奥巴马跑到一处不毛之地录制什么《荒野求生》，这说明什么？这说明奥巴马感受到了来自东方的威慑，为自己悲惨的未来慌忙做打算。","date":1489223423501,"forward":8,"imageUrls":["pic_small_100","pic_small_102"],"like":10,"user_introduction":"","username":"作家崔成浩"},{"avatar":"avatar_04","comment":5,"content":"【乌镇】隶属浙江省嘉兴市桐乡，西临湖州市，北界江苏苏州市吴江区，为二省三市交界之处。乌镇 曾名乌墩和青墩，具有六千余年悠久历史，同时是\u201d中国最后的枕水人家\u201c。是典型的江南地区汉族水乡古镇，有\u201c鱼米之乡，丝绸之府\u201d之称。","date":1489223423501,"forward":8,"imageUrls":["pic_small_45","pic_small_46","pic_small_47"],"like":10,"user_introduction":"一介文盲,半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_04","comment":5,"content":"冬日西湖美景(1)","date":1489223423501,"forward":8,"imageUrls":["pic_small_70","pic_small_71","pic_small_72","pic_small_73"],"like":10,"user_introduction":"一介文盲,半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_04","comment":5,"content":"水墨宏村 \u2014\u2014位于安徽省黄山西南麓，距黟县县城11公里，始建于南宋绍兴年间（公元1131\u2014\u20141162年），距今约有900年的历史。","date":1489223423501,"forward":8,"imageUrls":["pic_small_40","pic_small_41","pic_small_42","pic_small_43","pic_small_44"],"like":10,"user_introduction":"一介文盲,半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_04","comment":5,"content":"【乌镇】隶属浙江省嘉兴市桐乡，西临湖州市，北界江苏苏州市吴江区，为二省三市交界之处。乌镇 曾名乌墩和青墩，具有六千余年悠久历史，同时是\u201c中国最后的枕水人家\u201d。是典型的江南地区汉族水乡古镇，有\u201c鱼米之乡，丝绸之府\u201d之称。","date":1489223423501,"forward":8,"imageUrls":["pic_small_13","pic_small_14","pic_small_15","pic_small_16","pic_small_17","pic_small_18"],"like":10,"user_introduction":"一介文盲,半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_01","comment":5,"content":"记得上学的时候考试将至，全寝室的人都在看书，只有大哥在气定神闲地在打着游戏。我问道：\u201c你看完了？\u201d 他说：\u201c我看开了。\u201d","date":1489223423501,"forward":8,"imageUrls":[],"like":10,"user_introduction":"最冷笑话精选，每天分享笑话N枚，你的贴身开心果。","username":"冷笑话精选"},{"avatar":"avatar_04","comment":5,"content":"冬日西湖美景(2)","date":1489223423501,"forward":8,"imageUrls":["pic_small_74","pic_small_75","pic_small_76","pic_small_77"],"like":10,"user_introduction":"一介文盲,半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_04","comment":5,"content":"驾孤叶一片，荡人世沧桑，孤独和寂寥其实是人生的另一种宁静。","date":1489223423501,"forward":8,"imageUrls":["pic_small_01","pic_small_02","pic_small_03","pic_small_04","pic_small_05","pic_small_06","pic_small_07","pic_small_08","pic_small_09"],"like":10,"user_introduction":"一介文盲,半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_04","comment":5,"content":"心中无缺叫富，被人需要叫贵；快乐不是一种性格，而是一种能力。解决烦恼的最佳办法，就是忘掉烦恼；笑看风云淡，坐看云起时，不争就是慈悲，不辩就是智慧，不闻就是清净，不看就是自在，原谅就是解脱，知足就是放下；不乱于心，不困于情。不畏将来，不念过往。如此，安好！","date":1489223423501,"forward":8,"imageUrls":["pic_small_19","pic_small_20","pic_small_21","pic_small_22","pic_small_23","pic_small_24","pic_small_25","pic_small_26","pic_small_27"],"like":10,"user_introduction":"一介文盲，半个愤青，糊乱涂墨","username":"鸡汤"},{"avatar":"avatar_05","comment":5,"content":"远离雾霾的净土，这里是西藏。","date":1489223423501,"forward":8,"imageUrls":["pic_small_50","pic_small_51","pic_small_52","pic_small_53","pic_small_54","pic_small_55","pic_small_56","pic_small_57","pic_small_58"],"like":10,"user_introduction":"","username":"暖心画报"},{"avatar":"avatar_04","comment":5,"content":"月落乌啼霜满天，江枫渔火对愁眠。 姑苏城外寒山寺，夜半钟声到客船。","date":1489223423501,"forward":8,"imageUrls":["pic_small_60","pic_small_61","pic_small_62","pic_small_63","pic_small_64","pic_small_65","pic_small_66","pic_small_67","pic_small_68"],"like":10,"user_introduction":"一介文盲，半个愤青，糊乱涂墨","username":"鸡汤"}]
     */

    private boolean result;
    private List<WeiboBean> weibo;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public List<WeiboBean> getWeibo() {
        return weibo;
    }

    public void setWeibo(List<WeiboBean> weibo) {
        this.weibo = weibo;
    }

    public static class WeiboBean {
        /**
         * avatar : avatar_01
         * comment : 5
         * content : 我装作看不懂的样子[呲牙][偷笑][偷笑]，单身狗保重 [再见][再见] @冷笑话精选
         * date : 1489223423501
         * forward : 8
         * imageUrls : ["pic_1","pic_2","pic_3","pic_4","pic_5","pic_6","pic_7",
         * "pic_8","pic_9"]
         * like : 10
         * user_introduction : 最冷笑话精选，每天分享笑话N枚，你的贴身开心果。
         * username : 冷笑话精选
         */

        private String avatar;
        private int comment;
        private String content;
        private long date;
        private int forward;
        private int like;
        private String user_introduction;
        private String username;
        private List<String> imageUrls;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getComment() {
            return comment;
        }

        public void setComment(int comment) {
            this.comment = comment;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public int getForward() {
            return forward;
        }

        public void setForward(int forward) {
            this.forward = forward;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public String getUser_introduction() {
            return user_introduction;
        }

        public void setUser_introduction(String user_introduction) {
            this.user_introduction = user_introduction;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public List<String> getImageUrls() {
            return imageUrls;
        }

        public void setImageUrls(List<String> imageUrls) {
            this.imageUrls = imageUrls;
        }
    }
}
