package tf;

import Ad.O;
import Dc.C0545k3;
import Dc.C0639v;
import Pm.r0;
import W0.i2;
import X1.l;
import X1.w;
import Y6.k;
import android.app.Activity;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import d1.L;
import dg.C2978a;
import eg.C3136s;
import java.util.concurrent.CancellationException;
import je.C3693j0;
import je.C3695k0;
import je.EnumC3699m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qk.E;
import ti.C4532b;
import ue.C4801l;
import ui.AbstractC4852c;
import vd.b1;
import yd.H0;

/* JADX INFO: renamed from: tf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C4503a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C4503a(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        char[] cArr;
        int i = 1;
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter((k3.c) obj, "$this$viewModel");
                break;
            case 1:
                C0639v c0639v = (C0639v) obj;
                Intrinsics.checkNotNullParameter(c0639v, "it");
                break;
            case 2:
                b1 b1Var = (b1) obj;
                Intrinsics.checkNotNullParameter(b1Var, "user");
                break;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                ((Integer) obj).intValue();
                break;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                Intrinsics.checkNotNullParameter((O) obj, "it");
                break;
            case 5:
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                H0.x(new zj.d(1022, "https://www.kimi.com/user/agreement/modeluse?version=v2", (String) null, (String) null, (String) null, false));
                break;
            case 7:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                H0.x(new zj.d(1022, "https://www.kimi.com/user/agreement/userprivacy?version=v2", (String) null, (String) null, (String) null, false));
                break;
            case PushMessageReceiver.$stable /* 8 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                th.g.a.setValue(bool);
                break;
            case 9:
                Intrinsics.checkNotNullParameter((k3.c) obj, "$this$viewModel");
                break;
            case 10:
                Intrinsics.checkNotNullParameter((k3.c) obj, "$this$viewModel");
                break;
            case 11:
                l lVar = (l) obj;
                Intrinsics.checkNotNullParameter(lVar, "$this$semantics");
                w.d(lVar, "kimi sheet drag handle");
                break;
            case 12:
                Intrinsics.checkNotNullParameter((i2) obj, "it");
                break;
            case 13:
                CharSequence charSequence = (CharSequence) obj;
                Intrinsics.checkNotNullParameter(charSequence, "it");
                break;
            case 14:
                E e = (E) obj;
                Intrinsics.checkNotNullParameter(e, "it");
                break;
            case 15:
                C3693j0 c3693j0 = (C3693j0) obj;
                Intrinsics.checkNotNullParameter(c3693j0, "it");
                c3693j0.e.b = true;
                break;
            case 16:
                C3695k0 c3695k0 = (C3695k0) obj;
                Intrinsics.checkNotNullParameter(c3695k0, "it");
                if (c3695k0.z() && !c3695k0.r()) {
                    z = true;
                }
                break;
            case 17:
                C3693j0 c3693j02 = (C3693j0) obj;
                Intrinsics.checkNotNullParameter(c3693j02, "it");
                L l = c3693j02.b;
                EnumC3699m0 enumC3699m0 = EnumC3699m0.f;
                l.getClass();
                Intrinsics.checkNotNullParameter(enumC3699m0, "<set-?>");
                l.b = enumC3699m0;
                c3693j02.b.c = null;
                break;
            case 18:
                C3693j0 c3693j03 = (C3693j0) obj;
                Intrinsics.checkNotNullParameter(c3693j03, "it");
                L l2 = c3693j03.b;
                EnumC3699m0 enumC3699m02 = EnumC3699m0.g;
                l2.getClass();
                Intrinsics.checkNotNullParameter(enumC3699m02, "<set-?>");
                l2.b = enumC3699m02;
                c3693j03.b.c = null;
                c3693j03.a.d = C0545k3.d;
                break;
            case 19:
                Intrinsics.checkNotNullParameter((C3695k0) obj, "it");
                break;
            case 20:
                break;
            case 21:
                C3693j0 c3693j04 = (C3693j0) obj;
                L l3 = c3693j04.b;
                EnumC3699m0 enumC3699m03 = EnumC3699m0.c;
                l3.getClass();
                Intrinsics.checkNotNullParameter(enumC3699m03, "<set-?>");
                l3.b = enumC3699m03;
                c3693j04.b.c = null;
                break;
            case 22:
                break;
            case 23:
                C3693j0 c3693j05 = (C3693j0) obj;
                L l4 = c3693j05.b;
                EnumC3699m0 enumC3699m04 = EnumC3699m0.e;
                l4.getClass();
                Intrinsics.checkNotNullParameter(enumC3699m04, "<set-?>");
                l4.b = enumC3699m04;
                c3693j05.b.c = null;
                break;
            case 24:
                C4801l c4801l = (C4801l) obj;
                Intrinsics.checkNotNullParameter(c4801l, "it");
                boolean z = C2978a.a;
                C2978a.a("StreamServiceFactory", null, new C4532b(i, c4801l));
                if (!(c4801l instanceof C4801l)) {
                    c4801l = null;
                }
                if (c4801l != null) {
                    r0 r0Var = c4801l.i;
                    Mm.E.h(c4801l.e, (CancellationException) null);
                    k kVar = new k("android_tech_stream_service_evict", 29);
                    kVar.y(((C0639v) r0Var.getValue()).a, "chat_id");
                    kVar.v();
                }
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue < 0 || iIntValue >= 65536) {
                    int i2 = iIntValue - 65536;
                    cArr = new char[]{(char) (((i2 >> 10) & 1023) | 55296), (char) ((i2 & 1023) | 56320)};
                } else {
                    cArr = new char[]{(char) iIntValue};
                }
                break;
            case 28:
                Intrinsics.checkNotNullParameter((C3136s) obj, "it");
                break;
            default:
                v0.f fVar = (v0.f) obj;
                Intrinsics.checkNotNullParameter(fVar, "$this$LazyRow");
                v0.f.p(fVar, (String) null, (String) null, AbstractC4852c.K, 3);
                break;
        }
        return Unit.a;
    }
}
