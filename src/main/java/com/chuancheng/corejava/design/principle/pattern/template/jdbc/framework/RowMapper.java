package com.chuancheng.corejava.design.principle.pattern.template.jdbc.framework;

import java.sql.ResultSet;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 返回接口row
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
