package org.sagacity.sqltoy.plugins.id.macro.impl;

import java.util.HashMap;

import org.sagacity.sqltoy.plugins.id.macro.AbstractMacro;
import org.sagacity.sqltoy.plugins.id.macro.MacroUtils;
import org.sagacity.sqltoy.utils.StringUtil;

/**
 * @project sagacity-sqltoy4.2
 * @description 用于主键生成策略，根据依赖的字段值进行切割提取部分字符参与主键生成,用法:@substr(${colName},startIndex,length)
 *              例如 @substr(${colName},0,2) 从第0位开始切去2位字符,startIndex<0
 *              时，表示从尾部截取指定长度字符
 * @author zhongxuchen
 * 
 */
public class SubString extends AbstractMacro {

	@Override
	public String execute(String[] params, HashMap<String, Object> keyValues) {
		if (params == null || params.length < 3)
			return "";
		String baseParam = params[0].trim();
		String paramValue = null;
		// ${paramName} 格式
		if (baseParam.contains("$")) {
			paramValue = MacroUtils.replaceParams(baseParam, keyValues);
		} else {
			paramValue = keyValues.get(baseParam.toLowerCase()).toString();
		}
		if (StringUtil.isBlank(paramValue))
			return "";

		int strLength = paramValue.length();
		int start = Integer.parseInt(params[1]);
		int length = Integer.parseInt(params[2]);
		// 开始位置大于整体长度
		if (start >= strLength)
			return "";
		// start 为负数,表示截取尾部长度
		if (start < 0) {
			start = strLength - length;
		}
		// 长度符合切割标准
		if ((strLength - start) > length) {
			return paramValue.substring(start, start + length);
		}
		// 长度小于切割长度
		return paramValue.substring(start);
	}

	// public static void main(String[] args) {
	// String[] params = { "chen", "3", "2" };
	// String paramValue = params[0].toString();
	//
	// int strLength = paramValue.length();
	// int start = Integer.parseInt(params[1]);
	// int length = Integer.parseInt(params[2]);
	// String result = "";
	// // 开始位置大于整体长度
	// if (start >= strLength) {
	// result = "";
	// } else {
	// // start 为负数,表示截取尾部长度
	// if (start < 0) {
	// start = strLength - length;
	// }
	// // 长度符合切割标准
	// if ((strLength - start) > length) {
	// result = paramValue.substring(start, start + length);
	// } else {
	// // 长度小于切割长度
	// result = paramValue.substring(start);
	// }
	// }
	// System.err.println(result);
	// }
}
