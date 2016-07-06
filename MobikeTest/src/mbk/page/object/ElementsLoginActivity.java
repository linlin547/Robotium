package mbk.page.object;

import com.robotium.solo.Solo;

import Untils.Utils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ElementsLoginActivity {
	private Utils util;
	private Solo solo;
//	private EditText edt_mobileNum;
//	private EditText edt_verify;
//	private View btn_verify;
//	private View btn_login;

	public ElementsLoginActivity(Solo solo) {
		super();
		this.solo = solo;
		util = new Utils(solo);
//		initViews();
	}

	public void initViews() {
//		edt_mobileNum = util.findEditTextById("mobile_number");
//		edt_verify = util.findEditTextById("verify_code");
//		btn_verify = util.findViewById("get_verify_code_btn");
//		btn_login = util.findViewById("sign_in_button");
	}

	private void enterMobile(String phone) {
//		solo.clearEditText(edt_mobileNum);
		solo.enterText(util.findEditTextById("mobile_number"), phone);
	}

	private void enterVerifyCode(String verifycode) {
//		solo.clearEditText(edt_verify);
		solo.enterText(util.findEditTextById("verify_code"), verifycode);
	}

	public void getVerifyCode(String phone) {
		enterMobile(phone);
		solo.sleep(1000);
		solo.clickOnView(util.findViewById("get_verify_code_btn"));
		solo.sleep(1000);
	}

	public void dologin(String verifycode) {
		enterVerifyCode(verifycode);
		solo.sleep(1000);
		solo.clickOnView(util.findViewById("sign_in_button"));
		solo.sleep(3000);
	}

}