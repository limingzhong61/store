package cn.tedu.store.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceRuntimeAspect {

	@Around("execution(* cn.tedu.store.service.impl.*.*(..))")
	public Object a(ProceedingJoinPoint pjp) throws Throwable {
		// 记录开始时间
		long start = System.currentTimeMillis();
		
		// 执行切面应用到的方法
		Object result = pjp.proceed();
		
		// 记录结束时间并统计耗时
		long end = System.currentTimeMillis();
		System.err.println("耗时：" + (end - start) + "ms");
		
		// 返回
		return result;
	}
	
}









