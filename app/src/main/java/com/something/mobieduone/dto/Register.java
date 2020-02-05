package com.something.mobieduone.dto;

public class Register {
    private String txtusername;
    private String txtPassword;
    private String txtemail;
    private String txtfname;
    private String txtlname;
    private String txtlevel;

    public Register(String txtusername, String txtPassword, String txtemail, String txtfname, String txtlname, String txtlevel) {
        this.txtusername = txtusername;
        this.txtPassword = txtPassword;
        this.txtemail = txtemail;
        this.txtfname = txtfname;
        this.txtlname = txtlname;
        this.txtlevel = txtlevel;
    }

    public String getTxtusername() {
        return txtusername;
    }

    public void setTxtusername(String txtusername) {
        this.txtusername = txtusername;
    }

    public String getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(String txtPassword) {
        this.txtPassword = txtPassword;
    }

    public String getTxtemail() {
        return txtemail;
    }

    public void setTxtemail(String txtemail) {
        this.txtemail = txtemail;
    }

    public String getTxtname() {
        return txtfname;
    }

    public void setTxtname(String txtfname) {
        this.txtfname = txtfname;
    }

    public String getTxtlevel() {
        return txtlevel;
    }

    public void setTxtlevel(String txtlevel) {
        this.txtlevel = txtlevel;
    }

    public String getTxtlname() {
        return txtlname;
    }

    public void setTxtlname(String txtlname) {
        this.txtlname = txtlname;
    }
}
