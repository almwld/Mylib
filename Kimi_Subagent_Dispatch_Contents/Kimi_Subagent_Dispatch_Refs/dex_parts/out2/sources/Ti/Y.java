package Ti;

import Cf.C0387t;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.KimiApplication;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kotlin.jvm.internal.H b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ Y(kotlin.jvm.internal.H h, Function1 function1, int i) {
        this.a = i;
        this.b = h;
        this.c = function1;
    }

    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.c;
        kotlin.jvm.internal.H h = this.b;
        switch (i) {
            case 0:
                KimiApplication kimiApplication = Pf.B.a;
                if (System.currentTimeMillis() - h.a >= 500) {
                    function1.invoke(Boolean.TRUE);
                }
                h.a = System.currentTimeMillis();
                break;
            case 1:
                KimiApplication kimiApplication2 = Pf.B.a;
                if (System.currentTimeMillis() - h.a >= 500) {
                    function1.invoke(Boolean.FALSE);
                }
                h.a = System.currentTimeMillis();
                break;
            case 2:
                KimiApplication kimiApplication3 = Pf.B.a;
                if (System.currentTimeMillis() - h.a >= 500) {
                    new Y6.k("msh_icebreak_fresh_click", 29).v();
                    function1.invoke(gh.l.a);
                }
                h.a = System.currentTimeMillis();
                break;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                KimiApplication kimiApplication4 = Pf.B.a;
                if (System.currentTimeMillis() - h.a >= 500) {
                    function1.invoke(new C0387t());
                }
                h.a = System.currentTimeMillis();
                break;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                KimiApplication kimiApplication5 = Pf.B.a;
                if (System.currentTimeMillis() - h.a >= 500) {
                    function1.invoke(Boolean.FALSE);
                }
                h.a = System.currentTimeMillis();
                break;
            default:
                KimiApplication kimiApplication6 = Pf.B.a;
                if (System.currentTimeMillis() - h.a >= 500) {
                    function1.invoke(Boolean.TRUE);
                }
                h.a = System.currentTimeMillis();
                break;
        }
        return Unit.a;
    }
}
