package com.bharat.springdata.idgenerators;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CostomeRandomIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		Random random = null;
		int id = 0;
		random = new Random();
		id = random.nextInt(100000);
		return new Long(id);
	}

}
