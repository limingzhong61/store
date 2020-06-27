package cn.tedu.store;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DigestTestCase {
	
	@Test
	public void md5() {
		for (int i = 0; i < 10; i++) {
			String str = "123456";
			String salt = UUID.randomUUID().toString();
			System.err.println(salt);
			String md5 = DigestUtils
					.md5DigestAsHex((salt + str + salt).getBytes());
			System.err.println(md5);
			System.out.println();
		}
	}
	
	// select 原文 from table where 密文=?
	// 123456 e10adc3949ba59abbe56e057f20f883e
	// 123456TEDU 9f79c17f10461bd93063256e617e1e95
	
	// 000000 670b14728ad9902aecba32e22fa4f6bd
	
	// 0
	// cfcd208495d565ef66e7dff9f98764da
	
	// ??
	// f938a33ab10114aeb75c7062e405e282

}





