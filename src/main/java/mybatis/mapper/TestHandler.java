package mybatis.mapper;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author stone tiger
 * @Description: ${todo}
 * @date 2019/6/21
 */

public class TestHandler extends BaseTypeHandler<String> {


    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        System.out.println(jdbcType);
        System.out.println(JSON.toJSONString(parameter));
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println(rs);
        System.out.println(columnName);

        return null;
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println(rs);
        System.out.println(columnIndex);

        return null;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        System.out.println(cs);
        System.out.println(columnIndex);

        return null;
    }
}
