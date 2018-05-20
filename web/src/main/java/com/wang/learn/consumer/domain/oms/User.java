package com.wang.learn.consumer.domain.oms;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.modified_time
     *
     * @mbggenerated
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.created_time
     *
     * @mbggenerated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.is_enable
     *
     * @mbggenerated
     */
    private Boolean isEnable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.login_password
     *
     * @mbggenerated
     */
    private String loginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.telephone
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.department_id
     *
     * @mbggenerated
     */
    private Long departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.department_name
     *
     * @mbggenerated
     */
    private String departmentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.is_system
     *
     * @mbggenerated
     */
    private Boolean isSystem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_user.head_url
     *
     * @mbggenerated
     */
    private String headUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.user_id
     *
     * @return the value of oms_user.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.user_id
     *
     * @param userId the value for oms_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.modified_time
     *
     * @return the value of oms_user.modified_time
     *
     * @mbggenerated
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.modified_time
     *
     * @param modifiedTime the value for oms_user.modified_time
     *
     * @mbggenerated
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.created_time
     *
     * @return the value of oms_user.created_time
     *
     * @mbggenerated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.created_time
     *
     * @param createdTime the value for oms_user.created_time
     *
     * @mbggenerated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.is_enable
     *
     * @return the value of oms_user.is_enable
     *
     * @mbggenerated
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.is_enable
     *
     * @param isEnable the value for oms_user.is_enable
     *
     * @mbggenerated
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.login_name
     *
     * @return the value of oms_user.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.login_name
     *
     * @param loginName the value for oms_user.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.login_password
     *
     * @return the value of oms_user.login_password
     *
     * @mbggenerated
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.login_password
     *
     * @param loginPassword the value for oms_user.login_password
     *
     * @mbggenerated
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.user_name
     *
     * @return the value of oms_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.user_name
     *
     * @param userName the value for oms_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.nickname
     *
     * @return the value of oms_user.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.nickname
     *
     * @param nickname the value for oms_user.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.mobile
     *
     * @return the value of oms_user.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.mobile
     *
     * @param mobile the value for oms_user.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.telephone
     *
     * @return the value of oms_user.telephone
     *
     * @mbggenerated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.telephone
     *
     * @param telephone the value for oms_user.telephone
     *
     * @mbggenerated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.department_id
     *
     * @return the value of oms_user.department_id
     *
     * @mbggenerated
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.department_id
     *
     * @param departmentId the value for oms_user.department_id
     *
     * @mbggenerated
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.department_name
     *
     * @return the value of oms_user.department_name
     *
     * @mbggenerated
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.department_name
     *
     * @param departmentName the value for oms_user.department_name
     *
     * @mbggenerated
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.email
     *
     * @return the value of oms_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.email
     *
     * @param email the value for oms_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.remark
     *
     * @return the value of oms_user.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.remark
     *
     * @param remark the value for oms_user.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.is_system
     *
     * @return the value of oms_user.is_system
     *
     * @mbggenerated
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.is_system
     *
     * @param isSystem the value for oms_user.is_system
     *
     * @mbggenerated
     */
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_user.head_url
     *
     * @return the value of oms_user.head_url
     *
     * @mbggenerated
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_user.head_url
     *
     * @param headUrl the value for oms_user.head_url
     *
     * @mbggenerated
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }
}