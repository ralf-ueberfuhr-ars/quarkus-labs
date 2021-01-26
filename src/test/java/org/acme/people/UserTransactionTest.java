package org.acme.people;

import javax.inject.Inject;
import javax.transaction.Status;
import javax.transaction.SystemException;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@Transactional
class UserTransactionTest {

    //@Inject
    UserTransaction tx;

    @Test
    @Disabled
    void testTxActive() throws SystemException {
        Assertions.assertEquals(Status.STATUS_ACTIVE, tx.getStatus());
    }

}