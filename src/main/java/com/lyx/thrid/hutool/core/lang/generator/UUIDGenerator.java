package com.lyx.thrid.hutool.core.lang.generator;

import com.lyx.thrid.hutool.core.util.IdUtil;

/**
 * UUID生成器
 *
 * @author looly
 * @since 5.4.3
 */
public class UUIDGenerator implements Generator<String> {
	@Override
	public String next() {
		return IdUtil.fastUUID();
	}
}
