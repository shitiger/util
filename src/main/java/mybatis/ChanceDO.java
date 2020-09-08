package mybatis;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.util.Date;
import java.util.List;

@Alias(value = "shihu")
public class ChanceDO {
    /**
     * 机会id
     */
    private List<Long> chanceId;

    /**
     * 0:无 1:个人 2:企业,3个体经营（弃用）,4:事业单位团体（弃用） 5：政府 6：学校 7：媒体
     */
    private Integer userType;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名称 
     */
    private String userName;

    /**
     * 行业
     */
    private Integer industry;

    /**
     * 处理状态:枚举HandleStatusEnum
     */
    private Integer handleStatus;

    /**
     * 机会来源：见zhubajie_biaoju.bj_chance_source
     */
    private Integer source;

    /**
     * 机会类型：见zhubajie_biaoju.bj_chance_type
     */
    private Integer chanceType;

    /**
     * 关联id（可能是订单id，也可能是机会id）
     */
    private Long relationId;

    /**
     * 记录用户各种属性：linkman(联系人姓名)、phone、address、email、qq
     */
    private String options;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 年月日
     */
    private String createYmd;

    /**
     * 机会创建人id
     */
    private Long createManagerId;

    /**
     * 交易顾问
     */
    private Long managerId;

    /**
     * 顾问等级:1无、2铂金、3金牌、4银牌、5铜牌
     */
    private Integer managerRank;

    /**
     * 上一个顾问ID
     */
    private Long prevManagerId;

    /**
     * 需求描述
     */
    private String requirement;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 最后更新时间
     */
    private Long lastestTime;

    /**
     * 最后更新日期
     */
    private String lastestYmd;

    /**
     * 一级推广员ID
     */
    private Long spreader1stId;

    /**
     * 二级推广员ID
     */
    private Long spreader2ndId;

    /**
     * 推广唯一记录ID
     */
    private String spreadUuid;

    /**
     * 推广计划ID
     */
    private Long itemId;

    /**
     * 最后付款时间
     */
    private Long lastestPaidTime;

    /**
     * 最后付款日期
     */
    private String lastestPaidYmd;

    /**
     * 案件代理人ID
     */
    private Long agentId;

    /**
     * 机会类型组：见zhubajie_biaoju.bj_chance_group
     */
    private Integer chanceTypeGroup;

    /**
     * cookie信息ID
     */
    private Integer unionCookie;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 折后金额
     */
    private Double discountAmount;

    /**
     * 付款金额
     */
    private Double paidAmount;

    /**
     * 退款金额
     */
    private Double refundAmount;

    /**
     * 退款时间
     */
    private Long refundTime;

    /**
     * 退款日期
     */
    private String refundYmd;

    /**
     * 退款备注
     */
    private String refundRemark;

    /**
     * 第一次付款时间
     */
    private Long firstPaidTime;

    /**
     * 第一次付款日期
     */
    private String firstPaidYmd;

    /**
     * 是否系统：0否；1是
     */
    private Integer isSys;

    /**
     * 系统等级
     */
    private Integer sysLevel;

    /**
     * 跟进等级
     */
    private Integer level;

    /**
     * 下次跟进日期
     */
    private String expireDate;

    /**
     * 下次跟进时间
     */
    private Long expireTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否超期：0否；1是；
     */
    private Integer isOvertime;

    /**
     * 是否已经发送过提醒：0否；1是； 
     */
    private Integer isSend;

    /**
     * 是否放弃：0否；1是； 
     */
    private Integer isGiveup;

    /**
     * 放弃跟进原因
     */
    private Integer giveupOption;

    /**
     * 放弃时间 
     */
    private Long giveupTime;

    /**
     * 记录机会被放弃的次数
     */
    private Integer giveupNums;

    /**
     * 毁单原因
     */
    private Long burnedOption;

    /**
     * 毁单时间
     */
    private Date burnedTime;

    /**
     * 是否入海
     */
    private Integer isSea;

    /**
     * 驳回 0 否 1 是
     */
    private Integer isReject;

    /**
     * 入海时间
     */
    private Long seaTime;

    /**
     * 入海日期
     */
    private String seaDate;

    /**
     * 跟进时间
     */
    private Long followTime;

    /**
     * 跟进日期
     */
    private String followDate;

    /**
     * 跟进备注
     */
    private String followRemark;

    /**
     * 来源渠道
     */
    private Integer sourceChannel;

    /**
     * 提交IP
     */
    private Long ip;

    /**
     * 机会分配时间
     */
    private Long distributeTime;

    /**
     * 客户意向(10:A,11:A-,20:B,21:B-,30:C,40:D,50:E)
     */
    private Integer consumerIntention;

    /**
     * 重要程度
     */
    private Integer importanceDegree;

    /**
     * 行政区域代码
     */
    private Integer regionCode;

    /**
     * 行政区域名称
     */
    private String regionName;

    /**
     * 推广员联系电话
     */
    private String spreaderPhone;

    /**
     * 联系对象类型1：真实客户2：推广员
     */
    private Integer contactType;

    /**
     * 使用 utm_medium 来标识媒介0未知1：PC 2:wap
     */
    private Integer medium;

    /**
     * 使用utm_campaign来标识特定的产品促销活动或战略性广告系列 0无 1：0元疯抢 2：限时特惠 3：直降专区 4：签到礼包
     */
    private Integer campaign;

    /**
     * 关闭时间
     */
    private Long closeTime;

    /**
     * 附加属性 1 离职顾问派单 2 解锁生成机会
     */
    private Integer addedAttribute;

    /**
     * 客户主体名称
     */
    private String customerName;

    /**
     * 客户主体编码
     */
    private Integer customerNum;

    /**
     * 客户主体客户分类id
     */
    private Integer customerTypeId;

    /**
     * 客户主体注册资本,-1表示未知
     */
    private Long customerRegCapital;

    /**
     * 客户主体行业id
     */
    private Long customerIndustryId;

    /**
     * 客户主体公司注册日期或生日
     */
    private String customerDate;

    /**
     * 提交来源 0 未定义 1 客户提交 2 非客户提交
     */
    private Integer submitSource;

    /**
     * 提交渠道，对应渠道码表
     */
    private Integer submitChannel;

    /**
     * 代理商推广码
     */
    private String bjaSpreadCode;

    /**
     * 0 默认 1新派单
     */
    private Integer enterDispatchengine;

    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 用户锁定关系:0无 1普通锁定 2核心锁定
     */
    private Integer userLockType;

    /**
     * 客户主体类型:0不是老客户 1老客户
     */
    private Integer customerMold;

    /**
     * 毁单次数
     */
    private Integer destroyNum;

    private List<String> foolish;

    public List<String> getFoolish() {
        return foolish;
    }

    public void setFoolish(List<String> foolish) {
        this.foolish = foolish;
    }

    public Integer getDestroyNum() {
        return destroyNum;
    }

    public void setDestroyNum(Integer destroyNum) {
        this.destroyNum = destroyNum;
    }

    public List<Long> getChanceId() {
        return chanceId;
    }

    public void setChanceId(List<Long> chanceId) {
        this.chanceId = chanceId;
    }

    public Integer getUserType() {
        return userType;
    }
    
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Integer getIndustry() {
        return industry;
    }
    
    public void setIndustry(Integer industry) {
        this.industry = industry;
    }
    
    public Integer getHandleStatus() {
        return handleStatus;
    }
    
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }
    
    public Integer getSource() {
        return source;
    }
    
    public void setSource(Integer source) {
        this.source = source;
    }
    
    public Integer getChanceType() {
        return chanceType;
    }
    
    public void setChanceType(Integer chanceType) {
        this.chanceType = chanceType;
    }
    
    public Long getRelationId() {
        return relationId;
    }
    
    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }
    
    public String getOptions() {
        return options;
    }
    
    public void setOptions(String options) {
        this.options = options;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Long getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    
    public String getCreateYmd() {
        return createYmd;
    }
    
    public void setCreateYmd(String createYmd) {
        this.createYmd = createYmd;
    }
    
    public Long getCreateManagerId() {
        return createManagerId;
    }
    
    public void setCreateManagerId(Long createManagerId) {
        this.createManagerId = createManagerId;
    }
    
    public Long getManagerId() {
        return managerId;
    }
    
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }
    
    public Integer getManagerRank() {
        return managerRank;
    }
    
    public void setManagerRank(Integer managerRank) {
        this.managerRank = managerRank;
    }
    
    public Long getPrevManagerId() {
        return prevManagerId;
    }
    
    public void setPrevManagerId(Long prevManagerId) {
        this.prevManagerId = prevManagerId;
    }
    
    public String getRequirement() {
        return requirement;
    }
    
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    public Long getPid() {
        return pid;
    }
    
    public void setPid(Long pid) {
        this.pid = pid;
    }
    
    public Long getLastestTime() {
        return lastestTime;
    }
    
    public void setLastestTime(Long lastestTime) {
        this.lastestTime = lastestTime;
    }
    
    public String getLastestYmd() {
        return lastestYmd;
    }
    
    public void setLastestYmd(String lastestYmd) {
        this.lastestYmd = lastestYmd;
    }
    
    public Long getSpreader1stId() {
        return spreader1stId;
    }
    
    public void setSpreader1stId(Long spreader1stId) {
        this.spreader1stId = spreader1stId;
    }
    
    public Long getSpreader2ndId() {
        return spreader2ndId;
    }
    
    public void setSpreader2ndId(Long spreader2ndId) {
        this.spreader2ndId = spreader2ndId;
    }
    
    public String getSpreadUuid() {
        return spreadUuid;
    }
    
    public void setSpreadUuid(String spreadUuid) {
        this.spreadUuid = spreadUuid;
    }
    
    public Long getItemId() {
        return itemId;
    }
    
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    
    public Long getLastestPaidTime() {
        return lastestPaidTime;
    }
    
    public void setLastestPaidTime(Long lastestPaidTime) {
        this.lastestPaidTime = lastestPaidTime;
    }
    
    public String getLastestPaidYmd() {
        return lastestPaidYmd;
    }
    
    public void setLastestPaidYmd(String lastestPaidYmd) {
        this.lastestPaidYmd = lastestPaidYmd;
    }
    
    public Long getAgentId() {
        return agentId;
    }
    
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }
    
    public Integer getChanceTypeGroup() {
        return chanceTypeGroup;
    }
    
    public void setChanceTypeGroup(Integer chanceTypeGroup) {
        this.chanceTypeGroup = chanceTypeGroup;
    }
    
    public Integer getUnionCookie() {
        return unionCookie;
    }
    
    public void setUnionCookie(Integer unionCookie) {
        this.unionCookie = unionCookie;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    public Double getDiscountAmount() {
        return discountAmount;
    }
    
    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    public Double getPaidAmount() {
        return paidAmount;
    }
    
    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }
    
    public Double getRefundAmount() {
        return refundAmount;
    }
    
    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }
    
    public Long getRefundTime() {
        return refundTime;
    }
    
    public void setRefundTime(Long refundTime) {
        this.refundTime = refundTime;
    }
    
    public String getRefundYmd() {
        return refundYmd;
    }
    
    public void setRefundYmd(String refundYmd) {
        this.refundYmd = refundYmd;
    }
    
    public String getRefundRemark() {
        return refundRemark;
    }
    
    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }
    
    public Long getFirstPaidTime() {
        return firstPaidTime;
    }
    
    public void setFirstPaidTime(Long firstPaidTime) {
        this.firstPaidTime = firstPaidTime;
    }
    
    public String getFirstPaidYmd() {
        return firstPaidYmd;
    }
    
    public void setFirstPaidYmd(String firstPaidYmd) {
        this.firstPaidYmd = firstPaidYmd;
    }
    
    public Integer getIsSys() {
        return isSys;
    }
    
    public void setIsSys(Integer isSys) {
        this.isSys = isSys;
    }
    
    public Integer getSysLevel() {
        return sysLevel;
    }
    
    public void setSysLevel(Integer sysLevel) {
        this.sysLevel = sysLevel;
    }
    
    public Integer getLevel() {
        return level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }
    
    public String getExpireDate() {
        return expireDate;
    }
    
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    
    public Long getExpireTime() {
        return expireTime;
    }
    
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }
    
    public String getRemark() {
        return remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public Integer getIsOvertime() {
        return isOvertime;
    }
    
    public void setIsOvertime(Integer isOvertime) {
        this.isOvertime = isOvertime;
    }
    
    public Integer getIsSend() {
        return isSend;
    }
    
    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }
    
    public Integer getIsGiveup() {
        return isGiveup;
    }
    
    public void setIsGiveup(Integer isGiveup) {
        this.isGiveup = isGiveup;
    }
    
    public Integer getGiveupOption() {
        return giveupOption;
    }
    
    public void setGiveupOption(Integer giveupOption) {
        this.giveupOption = giveupOption;
    }
    
    public Long getGiveupTime() {
        return giveupTime;
    }
    
    public void setGiveupTime(Long giveupTime) {
        this.giveupTime = giveupTime;
    }
    
    public Integer getGiveupNums() {
        return giveupNums;
    }
    
    public void setGiveupNums(Integer giveupNums) {
        this.giveupNums = giveupNums;
    }
    
    public Long getBurnedOption() {
        return burnedOption;
    }
    
    public void setBurnedOption(Long burnedOption) {
        this.burnedOption = burnedOption;
    }
    
    public Date getBurnedTime() {
        return burnedTime;
    }
    
    public void setBurnedTime(Date burnedTime) {
        this.burnedTime = burnedTime;
    }
    
    public Integer getIsSea() {
        return isSea;
    }
    
    public void setIsSea(Integer isSea) {
        this.isSea = isSea;
    }
    
    public Integer getIsReject() {
        return isReject;
    }
    
    public void setIsReject(Integer isReject) {
        this.isReject = isReject;
    }
    
    public Long getSeaTime() {
        return seaTime;
    }
    
    public void setSeaTime(Long seaTime) {
        this.seaTime = seaTime;
    }
    
    public String getSeaDate() {
        return seaDate;
    }
    
    public void setSeaDate(String seaDate) {
        this.seaDate = seaDate;
    }
    
    public Long getFollowTime() {
        return followTime;
    }
    
    public void setFollowTime(Long followTime) {
        this.followTime = followTime;
    }
    
    public String getFollowDate() {
        return followDate;
    }
    
    public void setFollowDate(String followDate) {
        this.followDate = followDate;
    }
    
    public String getFollowRemark() {
        return followRemark;
    }
    
    public void setFollowRemark(String followRemark) {
        this.followRemark = followRemark;
    }
    
    public Integer getSourceChannel() {
        return sourceChannel;
    }
    
    public void setSourceChannel(Integer sourceChannel) {
        this.sourceChannel = sourceChannel;
    }
    
    public Long getIp() {
        return ip;
    }
    
    public void setIp(Long ip) {
        this.ip = ip;
    }
    
    public Long getDistributeTime() {
        return distributeTime;
    }
    
    public void setDistributeTime(Long distributeTime) {
        this.distributeTime = distributeTime;
    }
    
    public Integer getConsumerIntention() {
        return consumerIntention;
    }
    
    public void setConsumerIntention(Integer consumerIntention) {
        this.consumerIntention = consumerIntention;
    }
    
    public Integer getImportanceDegree() {
        return importanceDegree;
    }
    
    public void setImportanceDegree(Integer importanceDegree) {
        this.importanceDegree = importanceDegree;
    }
    
    public Integer getRegionCode() {
        return regionCode;
    }
    
    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }
    
    public String getRegionName() {
        return regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public String getSpreaderPhone() {
        return spreaderPhone;
    }
    
    public void setSpreaderPhone(String spreaderPhone) {
        this.spreaderPhone = spreaderPhone;
    }
    
    public Integer getContactType() {
        return contactType;
    }
    
    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }
    
    public Integer getMedium() {
        return medium;
    }
    
    public void setMedium(Integer medium) {
        this.medium = medium;
    }
    
    public Integer getCampaign() {
        return campaign;
    }
    
    public void setCampaign(Integer campaign) {
        this.campaign = campaign;
    }
    
    public Long getCloseTime() {
        return closeTime;
    }
    
    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }
    
    public Integer getAddedAttribute() {
        return addedAttribute;
    }
    
    public void setAddedAttribute(Integer addedAttribute) {
        this.addedAttribute = addedAttribute;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public Integer getCustomerNum() {
        return customerNum;
    }
    
    public void setCustomerNum(Integer customerNum) {
        this.customerNum = customerNum;
    }
    
    public Integer getCustomerTypeId() {
        return customerTypeId;
    }
    
    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
    
    public Long getCustomerRegCapital() {
        return customerRegCapital;
    }
    
    public void setCustomerRegCapital(Long customerRegCapital) {
        this.customerRegCapital = customerRegCapital;
    }
    
    public Long getCustomerIndustryId() {
        return customerIndustryId;
    }
    
    public void setCustomerIndustryId(Long customerIndustryId) {
        this.customerIndustryId = customerIndustryId;
    }
    
    public String getCustomerDate() {
        return customerDate;
    }
    
    public void setCustomerDate(String customerDate) {
        this.customerDate = customerDate;
    }
    
    public Integer getSubmitSource() {
        return submitSource;
    }
    
    public void setSubmitSource(Integer submitSource) {
        this.submitSource = submitSource;
    }
    
    public Integer getSubmitChannel() {
        return submitChannel;
    }
    
    public void setSubmitChannel(Integer submitChannel) {
        this.submitChannel = submitChannel;
    }
    
    public String getBjaSpreadCode() {
        return bjaSpreadCode;
    }
    
    public void setBjaSpreadCode(String bjaSpreadCode) {
        this.bjaSpreadCode = bjaSpreadCode;
    }
    
    public Integer getEnterDispatchengine() {
        return enterDispatchengine;
    }
    
    public void setEnterDispatchengine(Integer enterDispatchengine) {
        this.enterDispatchengine = enterDispatchengine;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserLockType() {
        return userLockType;
    }

    public void setUserLockType(Integer userLockType) {
        this.userLockType = userLockType;
    }

    public Integer getCustomerMold() {
        return customerMold;
    }

    public void setCustomerMold(Integer customerMold) {
        this.customerMold = customerMold;
    }
}