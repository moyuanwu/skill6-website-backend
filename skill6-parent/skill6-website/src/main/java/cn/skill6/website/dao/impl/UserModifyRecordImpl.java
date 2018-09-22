package cn.skill6.website.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.skill6.common.entity.po.UserModifyRecord;
import cn.skill6.website.dao.UserModifyRecordMapper;
import cn.skill6.website.dao.intf.UserModifyRecordOper;

/**
 * 用户信息修改记录操作实现类
 *
 * @author 何明胜
 * @version 1.0.1
 * @since 2018年8月28日 上午12:19:34
 */
public class UserModifyRecordImpl implements UserModifyRecordOper {
  private static final Logger logger = LoggerFactory.getLogger(UserModifyRecordImpl.class);

  @Autowired private UserModifyRecordMapper userModifyRecordMapper;

  @Override
  public int deleteByUserId(String userId) {
    logger.warn("删除id为{}的用户信息修改记录", userId);

    return userModifyRecordMapper.deleteByPrimaryKey(userId);
  }

  @Override
  public int addUserModifyRecord(UserModifyRecord userModifyRecord) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public UserModifyRecord findByUserId(String userId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<UserModifyRecord> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int modifyByUserId(UserModifyRecord userModifyRecord) {
    // TODO Auto-generated method stub
    return 0;
  }
}
