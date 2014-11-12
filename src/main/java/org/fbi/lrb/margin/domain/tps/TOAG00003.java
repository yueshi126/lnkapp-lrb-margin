package org.fbi.lrb.margin.domain.tps;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.fbi.lrb.margin.domain.tps.base.TpsMsg;
import org.fbi.lrb.margin.domain.tps.base.TpsMsgBody;

/**
 * �������	��������	����	����	��ע
     Result	�������롡	C	2	00���ɹ�������01�������ظ���09�� ��������99��ϵͳ����
     AcctNo	���˺�	C	100	���˺������к���ϵͳ�Զ�����
     Count	�������	C	500
 */
@XStreamAlias("root")
public class TOAG00003 extends TpsMsg {
    private MsgBody body = new MsgBody();

    public MsgBody getBody() {
        return body;
    }

    public static class MsgBody extends TpsMsgBody {
        private String Result;
        private String AcctNo;
        private String AddWord;

        public String getResult() {
            return Result;
        }

        public void setResult(String result) {
            this.Result = result;
        }

        public String getAcctNo() {
            return AcctNo;
        }

        public void setAcctNo(String acctNo) {
            this.AcctNo = acctNo;
        }

        public String getAddWord() {
            return AddWord;
        }

        public void setAddWord(String addWord) {
            AddWord = addWord;
        }

        @Override
        public String toString() {
            return "MsgBody{" +
                    "Result='" + Result + '\'' +
                    ", AcctNo='" + AcctNo + '\'' +
                    ", Count='" + AddWord + '\'' +
                    '}';
        }
    }

}