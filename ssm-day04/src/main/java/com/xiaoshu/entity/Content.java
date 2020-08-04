package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Content implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "contentId")
    private Integer contentid;

    /**
     * 广告分类
     */
    @Column(name = "contentCategoryId")
    private Integer contentcategoryid;

    /**
     * 广告标题
     */
    private String contenttitle;

    /**
     * 广告链接
     */
    private String contenturl;

    /**
     * 图片路径
     */
    private String picpath;

    /**
     * 费用
     */
    private String price;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createtime;
@Transient
    private ContentCategory contentCategory;
    
    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return contentId - 主键
     */
    public Integer getContentid() {
        return contentid;
    }

    /**
     * 设置主键
     *
     * @param contentid 主键
     */
    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    /**
     * 获取广告分类
     *
     * @return contentCategoryId - 广告分类
     */
    public Integer getContentcategoryid() {
        return contentcategoryid;
    }

    /**
     * 设置广告分类
     *
     * @param contentcategoryid 广告分类
     */
    public void setContentcategoryid(Integer contentcategoryid) {
        this.contentcategoryid = contentcategoryid;
    }

    /**
     * 获取广告标题
     *
     * @return contenttitle - 广告标题
     */
    public String getContenttitle() {
        return contenttitle;
    }

    /**
     * 设置广告标题
     *
     * @param contenttitle 广告标题
     */
    public void setContenttitle(String contenttitle) {
        this.contenttitle = contenttitle == null ? null : contenttitle.trim();
    }

    /**
     * 获取广告链接
     *
     * @return contenturl - 广告链接
     */
    public String getContenturl() {
        return contenturl;
    }

    /**
     * 设置广告链接
     *
     * @param contenturl 广告链接
     */
    public void setContenturl(String contenturl) {
        this.contenturl = contenturl == null ? null : contenturl.trim();
    }

    /**
     * 获取图片路径
     *
     * @return picpath - 图片路径
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * 设置图片路径
     *
     * @param picpath 图片路径
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    /**
     * 获取费用
     *
     * @return price - 费用
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置费用
     *
     * @param price 费用
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contentid=").append(contentid);
        sb.append(", contentcategoryid=").append(contentcategoryid);
        sb.append(", contenttitle=").append(contenttitle);
        sb.append(", contenturl=").append(contenturl);
        sb.append(", picpath=").append(picpath);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}