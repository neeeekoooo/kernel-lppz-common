package com.lppz.dubbo.log.pojo;

import java.util.Date;

public class ExceptionLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_log.id
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_log.name
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_log.desc
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_log.createtime
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_log.ip
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_log.sendflag
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    private Integer sendflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_log.id
     *
     * @return the value of exception_log.id
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_log.id
     *
     * @param id the value for exception_log.id
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_log.name
     *
     * @return the value of exception_log.name
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_log.name
     *
     * @param name the value for exception_log.name
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_log.desc
     *
     * @return the value of exception_log.desc
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_log.desc
     *
     * @param desc the value for exception_log.desc
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_log.createtime
     *
     * @return the value of exception_log.createtime
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_log.createtime
     *
     * @param createtime the value for exception_log.createtime
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_log.ip
     *
     * @return the value of exception_log.ip
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_log.ip
     *
     * @param ip the value for exception_log.ip
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_log.sendflag
     *
     * @return the value of exception_log.sendflag
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public Integer getSendflag() {
        return sendflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_log.sendflag
     *
     * @param sendflag the value for exception_log.sendflag
     *
     * @mbggenerated Fri Jul 08 11:31:12 CST 2016
     */
    public void setSendflag(Integer sendflag) {
        this.sendflag = sendflag;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExceptionLog [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", createtime=");
		builder.append(createtime);
		builder.append(", ip=");
		builder.append(ip);
		builder.append(", sendflag=");
		builder.append(sendflag);
		builder.append("]");
		return builder.toString();
	}
}