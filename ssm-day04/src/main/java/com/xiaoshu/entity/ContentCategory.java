package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class ContentCategory implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "contentCategoryId")
    private Integer contentcategoryid;

    /**
     * 分类
     */
    private String categoryname;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return contentCategoryId - 主键
     */
    public Integer getContentcategoryid() {
        return contentcategoryid;
    }

    /**
     * 设置主键
     *
     * @param contentcategoryid 主键
     */
    public void setContentcategoryid(Integer contentcategoryid) {
        this.contentcategoryid = contentcategoryid;
    }

    /**
     * 获取分类
     *
     * @return categoryname - 分类
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * 设置分类
     *
     * @param categoryname 分类
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
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
        sb.append(", contentcategoryid=").append(contentcategoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}