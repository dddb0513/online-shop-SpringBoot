package scut.javawebonlineshop.service.imp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
@Slf4j
@Service
public class EmailServiceImp {
    @Autowired
    private JavaMailSender mailSender;

    private ConcurrentHashMap<String, String> verificationCodes = new ConcurrentHashMap<>();

    public void sendVerificationCode(String email) {
        String code = String.valueOf((int)(Math.random() * 900000) + 100000); // 生成六位随机验证码
        verificationCodes.put(email, code);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("您的注册验证码");
        message.setText("您的验证码是：" + code + "，请在注册时输入。");
        message.setFrom("2598171336@qq.com"); // 发件人地址
        mailSender.send(message);
    }

    public boolean verifyCode(String email, String code) {
        return verificationCodes.containsKey(email) && verificationCodes.get(email).equals(code);
    }
    public void cleanupCode(String email) {
        verificationCodes.remove(email);
    }

    public void sendConfirmationEmail(String email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("订单确认");
        message.setText("请尽快确认您的订单");
        message.setFrom("2598171336@qq.com");
        mailSender.send(message);
    }
}
