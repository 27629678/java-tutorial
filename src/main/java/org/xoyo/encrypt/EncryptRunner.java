package org.xoyo.encrypt;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.xoyo.TestingRunner;
import org.xoyo.base.DescriptionObject;

public class EncryptRunner extends DescriptionObject implements TestingRunner {

    @Override
    public void run() {
        description();

        String salt = "cd09aafe682642478158c0642b045681";
    String mesg =
        "{\"pushId\":\"2019031915331278114\",\"sequence\":1,\"total\":1,\"skuList\":[{\"itemId\":469185004,\"totalAdviceCount\":180,\"skuId\":471343023,\"warehouseCode\":\"769DCC\"}],\"pushTime\":\"1552980792781\"}";

        System.out.println(new String(Base64.encodeBase64(DigestUtils.md5(mesg+salt))));
    }
}
