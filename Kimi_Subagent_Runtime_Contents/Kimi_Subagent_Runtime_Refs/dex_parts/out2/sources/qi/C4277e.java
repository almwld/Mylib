package qi;

import Cf.L7;
import Cf.S3;
import Hd.G;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import ee.C3087f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ti.C4545o;
import ue.C4801l;
import xi.O;
import xi.h0;
import ze.a0;

/* JADX INFO: renamed from: qi.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C4277e extends kotlin.jvm.internal.o implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4277e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                G g = (G) obj;
                Intrinsics.checkNotNullParameter(g, "p0");
                ((p) ((kotlin.jvm.internal.e) this).receiver).E(g);
                break;
            case 1:
                um.d dVar = (um.d) obj;
                Intrinsics.checkNotNullParameter(dVar, "p0");
                break;
            case 2:
                G g2 = (G) obj;
                Intrinsics.checkNotNullParameter(g2, "p0");
                ((si.y) ((kotlin.jvm.internal.e) this).receiver).E(g2);
                break;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                G g3 = (G) obj;
                Intrinsics.checkNotNullParameter(g3, "p0");
                ((te.C) ((kotlin.jvm.internal.e) this).receiver).E(g3);
                break;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                G g4 = (G) obj;
                Intrinsics.checkNotNullParameter(g4, "p0");
                ((C4545o) ((kotlin.jvm.internal.e) this).receiver).E(g4);
                break;
            case 5:
                G g5 = (G) obj;
                Intrinsics.checkNotNullParameter(g5, "p0");
                ((C4545o) ((kotlin.jvm.internal.e) this).receiver).E(g5);
                break;
            case 6:
                a0 a0Var = (a0) obj;
                Intrinsics.checkNotNullParameter(a0Var, "p0");
                ((C4801l) ((kotlin.jvm.internal.e) this).receiver).d(a0Var);
                break;
            case 7:
                a0 a0Var2 = (a0) obj;
                Intrinsics.checkNotNullParameter(a0Var2, "p0");
                ((C4801l) ((kotlin.jvm.internal.e) this).receiver).d(a0Var2);
                break;
            case PushMessageReceiver.$stable /* 8 */:
                G g6 = (G) obj;
                Intrinsics.checkNotNullParameter(g6, "p0");
                ((h0) ((kotlin.jvm.internal.e) this).receiver).E(g6);
                break;
            case 9:
                G g7 = (G) obj;
                Intrinsics.checkNotNullParameter(g7, "p0");
                ((h0) ((kotlin.jvm.internal.e) this).receiver).E(g7);
                break;
            case 10:
                G g8 = (G) obj;
                Intrinsics.checkNotNullParameter(g8, "p0");
                ((O) ((kotlin.jvm.internal.e) this).receiver).E(g8);
                break;
            case 11:
                G g9 = (G) obj;
                Intrinsics.checkNotNullParameter(g9, "p0");
                ((O) ((kotlin.jvm.internal.e) this).receiver).E(g9);
                break;
            case 12:
                G g10 = (G) obj;
                Intrinsics.checkNotNullParameter(g10, "p0");
                ((S3) ((kotlin.jvm.internal.e) this).receiver).E(g10);
                break;
            case 13:
                G g11 = (G) obj;
                Intrinsics.checkNotNullParameter(g11, "p0");
                ((L7) ((kotlin.jvm.internal.e) this).receiver).E(g11);
                break;
            case 14:
                G g12 = (G) obj;
                Intrinsics.checkNotNullParameter(g12, "p0");
                ((C3087f) ((kotlin.jvm.internal.e) this).receiver).E(g12);
                break;
            case 15:
                G g13 = (G) obj;
                Intrinsics.checkNotNullParameter(g13, "p0");
                ((S3) ((kotlin.jvm.internal.e) this).receiver).E(g13);
                break;
            case 16:
                G g14 = (G) obj;
                Intrinsics.checkNotNullParameter(g14, "p0");
                ((S3) ((kotlin.jvm.internal.e) this).receiver).E(g14);
                break;
            case 17:
                G g15 = (G) obj;
                Intrinsics.checkNotNullParameter(g15, "p0");
                ((S3) ((kotlin.jvm.internal.e) this).receiver).E(g15);
                break;
            case 18:
                G g16 = (G) obj;
                Intrinsics.checkNotNullParameter(g16, "p0");
                ((S3) ((kotlin.jvm.internal.e) this).receiver).E(g16);
                break;
            case 19:
                G g17 = (G) obj;
                Intrinsics.checkNotNullParameter(g17, "p0");
                ((L7) ((kotlin.jvm.internal.e) this).receiver).E(g17);
                break;
            default:
                G g18 = (G) obj;
                Intrinsics.checkNotNullParameter(g18, "p0");
                ((zh.p) ((kotlin.jvm.internal.e) this).receiver).E(g18);
                break;
        }
        return Unit.a;
    }
}
