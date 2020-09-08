package mybatis.mapper;

import mybatis.ChanceDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IChanceMapper2 {


    List<ChanceDO> getChanceByChanceId(String table, ChanceDO chanceId, String chances);
    List<ChanceDO> getChanceByChance3d(ChanceDO chanceId);
}