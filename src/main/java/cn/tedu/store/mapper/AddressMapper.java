package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.store.entity.Address;

/**
 * 处理收货地址数据的持久层接口
 */
public interface AddressMapper {

	/**
	 * 插入收货地址数据
	 * @param address 收货地址数据
	 * @return 受影响的行数
	 */
	Integer insert(Address address);

	/**
	 * 将指定用户的所有收货地址数据全部设置为“非默认”
	 * @param uid 用户的id
	 * @param modifiedUser 修改执行人
	 * @param modifiedTime 修改时间
	 * @return 受影响的行数
	 */
	Integer updateNonDefault(
	    @Param("uid") Integer uid, 
	    @Param("modifiedUser") String modifiedUser, 
	    @Param("modifiedTime") Date modifiedTime);

	/**
	 * 将指定的收货地址数据设置为“默认”
	 * @param aid 收货地址的id
	 * @param modifiedUser 修改执行人
	 * @param modifiedTime 修改时间
	 * @return 受影响的行数
	 */
	Integer updateDefault(
	    @Param("aid") Integer aid,
	    @Param("modifiedUser") String modifiedUser, 
	    @Param("modifiedTime") Date modifiedTime);

	/**
	 * 根据收货地址数据的id删除数据
	 * @param aid 收货地址数据的id
	 * @return 受影响的行数
	 */
	Integer deleteByAid(Integer aid);
	
	/**
	 * 根据用户id查询该用户的收货地址的数量
	 * @param uid 用户id
	 * @return 该用户的收货地址的数量，如果该用户当前没有收货地址数据，则返回0
	 */
	Integer getCountByUid(Integer uid);
	
	/**
	 * 获取指定用户的收货地址列表
	 * @param uid 用户的id
	 * @return 该用户的收货地址列表
	 */
	List<Address> findListByUid(Integer uid);
	
	/**
	 * 根据收货地址数据的id查询收货地址详情
	 * @param aid 收货地址数据的id
	 * @return 匹配的收货地址数据，如果没有匹配的数据，则返回null
	 */
	Address findByAid(Integer aid);

	/**
	 * 查询指定用户的最后修改的收货地址数据
	 * @param uid 用户的id
	 * @return 指定用户的最后修改的收货地址数据
	 */
	Address findLastModifiedByUid(Integer uid);
}




