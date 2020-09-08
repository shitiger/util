package mybatis.mapper;

import mybatis.ChanceDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface IChanceMapper {


    List<ChanceDO> getChanceByChanceId2(@Param("table") String table, @Param("chanceId") ChanceDO chanceId,@Param("chances") String chances);
    List<ChanceDO> getChanceByChance3d(ChanceDO chanceId);
}