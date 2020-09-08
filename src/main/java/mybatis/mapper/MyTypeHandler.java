package mybatis.mapper;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/10/21
 */
public class MyTypeHandler implements TypeHandler {
    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(2,parameter.toString()+"aaaaa");
    }

    @Override
    public Object getResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println(rs);
        System.out.println(columnName);

        return null;
    }

    @Override
    public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println(rs);
        System.out.println(columnIndex);

        return null;
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
