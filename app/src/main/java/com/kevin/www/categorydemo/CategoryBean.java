package com.kevin.www.categorydemo;

import java.io.Serializable;
import java.util.List;

/**
 * author：wangzihang
 * date： 2017/8/4 11:13
 * desctiption：
 * e-mail：wangzihang@xiaohongchun.com
 */

public class CategoryBean implements Serializable {


    /**
     * code : 0
     * data :
     */

    private int code;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {


        private String type;
        private String moreIcon;
        private String moreText;
        private String moduleStyle;
        private String moduleTitle;
        private String moreLinkType;
        private String interfaceLink;
        private String moreLinkParam;
        private String moreTextDisplay;
        private String moreUniversalNavigator;
        private List<DataListBean> dataList;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMoreIcon() {
            return moreIcon;
        }

        public void setMoreIcon(String moreIcon) {
            this.moreIcon = moreIcon;
        }

        public String getMoreText() {
            return moreText;
        }

        public void setMoreText(String moreText) {
            this.moreText = moreText;
        }

        public String getModuleStyle() {
            return moduleStyle;
        }

        public void setModuleStyle(String moduleStyle) {
            this.moduleStyle = moduleStyle;
        }

        public String getModuleTitle() {
            return moduleTitle;
        }

        public void setModuleTitle(String moduleTitle) {
            this.moduleTitle = moduleTitle;
        }

        public String getMoreLinkType() {
            return moreLinkType;
        }

        public void setMoreLinkType(String moreLinkType) {
            this.moreLinkType = moreLinkType;
        }

        public String getInterfaceLink() {
            return interfaceLink;
        }

        public void setInterfaceLink(String interfaceLink) {
            this.interfaceLink = interfaceLink;
        }

        public String getMoreLinkParam() {
            return moreLinkParam;
        }

        public void setMoreLinkParam(String moreLinkParam) {
            this.moreLinkParam = moreLinkParam;
        }

        public String getMoreTextDisplay() {
            return moreTextDisplay;
        }

        public void setMoreTextDisplay(String moreTextDisplay) {
            this.moreTextDisplay = moreTextDisplay;
        }

        public String getMoreUniversalNavigator() {
            return moreUniversalNavigator;
        }

        public void setMoreUniversalNavigator(String moreUniversalNavigator) {
            this.moreUniversalNavigator = moreUniversalNavigator;
        }

        public List<DataListBean> getDataList() {
            return dataList;
        }

        public void setDataList(List<DataListBean> dataList) {
            this.dataList = dataList;
        }

        public static class DataListBean {
            /**
             * type:我自己加的一个标识
             * id :
             * desc :
             * type : category
             * title : 防晒
             * imgURL : https://wicdn.xiaohongchun.com/xhc-plat/1498710441052_sEBKxDGdsk.png
             * linkType : storeTags
             * linkParam :
             * online_time :
             * offline_time :
             * universalNavigator : xhc://xiaohongchun/params?storeTags=&track_info=%7B%22api%22%3A%22%2Fauto_index%2Fauto_index%2Fcategory_index_modules%22%7D
             */

            private String id;
            private String desc;
            private String type;
            private String title;
            private String imgURL;
            private String linkType;
            private String linkParam;
            private String online_time;
            private String offline_time;
            private String universalNavigator;

            public DataListBean() {
                super();
            }

            public DataListBean(String type) {
                this.type = type;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImgURL() {
                return imgURL;
            }

            public void setImgURL(String imgURL) {
                this.imgURL = imgURL;
            }

            public String getLinkType() {
                return linkType;
            }

            public void setLinkType(String linkType) {
                this.linkType = linkType;
            }

            public String getLinkParam() {
                return linkParam;
            }

            public void setLinkParam(String linkParam) {
                this.linkParam = linkParam;
            }

            public String getOnline_time() {
                return online_time;
            }

            public void setOnline_time(String online_time) {
                this.online_time = online_time;
            }

            public String getOffline_time() {
                return offline_time;
            }

            public void setOffline_time(String offline_time) {
                this.offline_time = offline_time;
            }

            public String getUniversalNavigator() {
                return universalNavigator;
            }

            public void setUniversalNavigator(String universalNavigator) {
                this.universalNavigator = universalNavigator;
            }
        }
    }
}
