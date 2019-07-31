/**
 *@Generated by sagacity-quickvo 4.0
 */
package com.sagframe.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.math.BigDecimal;
import java.util.Date;
import com.sagframe.sqltoy.showcase.vo.base.AbstractTransInfo15dVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_trans_info_15d,Remark:支付交易流水表(15天表) 	
 */
@SqlToyEntity
public class TransInfo15dVO extends AbstractTransInfo15dVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4530699603222158703L;
	
	/**
	 * 请绝对不要在此类中重复定义Abstract类中的对应表字段的属性,易导致属性失去@Column关联表字段的注解特征,无法正确生成相应的sql
	 * 如覆盖定义了属性C,原本生成 insert into tableName (A,B,C) values(?,?,?) 变成了 insert into tableName (A,B) values(?,?)
	 */
	 
	/** default constructor */
	public TransInfo15dVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public TransInfo15dVO(String transId)
	{
		this.transId=transId;
	}

	/** minimal constructor */
	public TransInfo15dVO(String transId,String transCode,String transChannel,BigDecimal transAmt,Integer status,String resultCode,Date transTime,Date transDate,String userId)
	{
		this.transId=transId;
		this.transCode=transCode;
		this.transChannel=transChannel;
		this.transAmt=transAmt;
		this.status=status;
		this.resultCode=resultCode;
		this.transTime=transTime;
		this.transDate=transDate;
		this.userId=userId;
	}

	/** full constructor */
	public TransInfo15dVO(String transId,String transCode,String transChannel,BigDecimal transAmt,Integer status,String resultCode,Date transTime,Date transDate,String userId,String cardNo)
	{
		this.transId=transId;
		this.transCode=transCode;
		this.transChannel=transChannel;
		this.transAmt=transAmt;
		this.status=status;
		this.resultCode=resultCode;
		this.transTime=transTime;
		this.transDate=transDate;
		this.userId=userId;
		this.cardNo=cardNo;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	
	//请绝对不要在此类中重复定义Abstract类中的对应表字段的属性,易导致属性失去@Column关联表字段的注解特征,无法正确生成相应的sql
	//如覆盖定义了属性C,原本生成 insert into tableName (A,B,C) values(?,?,?) 变成了 insert into tableName (A,B) values(?,?)
	 
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public TransInfo15dVO clone() {
		try {
			// TODO Auto-generated method stub
			return (TransInfo15dVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}