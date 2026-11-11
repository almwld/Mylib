package Le;

import Pi.O0;
import aj.AbstractC2415q;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class Y implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ Y(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                function0.invoke();
                break;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                function0.invoke();
                break;
            case 5:
                AbstractC2415q.K(new Y(6, function0));
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                function0.invoke();
                break;
            case PushMessageReceiver.$stable /* 8 */:
                function0.invoke();
                break;
            case 9:
                function0.invoke();
                break;
            case 10:
                function0.invoke();
                break;
            case 11:
                function0.invoke();
                break;
            case 12:
                function0.invoke();
                break;
            case 13:
                function0.invoke();
                break;
            case 14:
                function0.invoke();
                break;
            case 15:
                jk.d dVar = Sf.d.a;
                Tm.e eVar = Mm.P.a;
                Mm.E.z(dVar, Tm.d.c, (Mm.C) null, new Oe.u(function0, null), 2);
                break;
            case 16:
                function0.invoke();
                break;
            case 17:
                function0.invoke();
                break;
            case 18:
                function0.invoke();
                break;
            case 19:
                function0.invoke();
                break;
            case 20:
                int i2 = O0.q;
                function0.invoke();
                break;
            case 21:
                function0.invoke();
                break;
            case 22:
                function0.invoke();
                break;
            case 23:
                function0.invoke();
                break;
            case 24:
                function0.invoke();
                break;
            case 25:
                function0.invoke();
                break;
            case 26:
                function0.invoke();
                break;
            case 27:
                function0.invoke();
                break;
            case 28:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
