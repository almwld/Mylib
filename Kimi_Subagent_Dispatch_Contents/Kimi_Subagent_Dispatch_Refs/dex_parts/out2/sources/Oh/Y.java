package Oh;

import Ad.C0098n;
import Kg.C1372l;
import cf.C2606q;
import com.google.firebase.messaging.SendException;
import dg.C2978a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ng.C4068d;
import ub.AbstractC4657l7;
import yd.AbstractC5709r0;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class Y implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4068d b;
    public final /* synthetic */ C4068d c;

    public /* synthetic */ Y(C4068d c4068d, C4068d c4068d2, int i) {
        this.a = i;
        this.b = c4068d;
        this.c = c4068d2;
    }

    public final Object invoke(Object obj) {
        int length;
        int i = this.a;
        C4068d c4068d = this.c;
        C4068d c4068d2 = this.b;
        switch (i) {
            case 0:
                n2.l lVar = (n2.l) obj;
                if (n2.l.b(((n2.l) c4068d.a.getValue()).a, 0L) || ((int) (lVar.a >> 32)) != ((int) (((n2.l) c4068d2.a.getValue()).a >> 32)) || ((int) (lVar.a & 4294967295L)) != ((int) (((n2.l) c4068d2.a.getValue()).a & 4294967295L))) {
                    C2978a.c("ImageCapture", new Z(lVar, 0));
                    c4068d.setValue(new n2.l(lVar.a));
                }
                break;
            case 1:
                n2.l lVar2 = (n2.l) obj;
                if (n2.l.b(((n2.l) c4068d.a.getValue()).a, 0L) || ((int) (lVar2.a >> 32)) != ((int) (((n2.l) c4068d2.a.getValue()).a >> 32)) || ((int) (lVar2.a & 4294967295L)) != ((int) (((n2.l) c4068d2.a.getValue()).a & 4294967295L))) {
                    C2978a.c("ImageCapture", new Z(lVar2, 3));
                    c4068d.setValue(new n2.l(lVar2.a));
                }
                break;
            case 2:
                f2.w wVar = (f2.w) obj;
                Qk.F f = Qk.F.d;
                Intrinsics.checkNotNullParameter(wVar, "it");
                String str = wVar.a.b;
                if (!StringsKt.W(str) || ((f2.w) c4068d2.a.getValue()).a.b.length() != 0) {
                    try {
                        length = AbstractC4657l7.c(str, Charsets.UTF_8).length;
                    } catch (Exception e) {
                        boolean z = C2978a.a;
                        C2978a.b("EditProfile", null, new Bd.c(16, e));
                        length = str.length();
                    }
                    if (length == 0) {
                        Sk.w wVar2 = Qk.C0.a;
                        Intrinsics.checkNotNullParameter(f, "<this>");
                        AbstractC5709r0.j((Zn.L) Qk.C0.M.getValue(), 6);
                    }
                    C0098n c0098n = C0098n.a;
                    if (!Intrinsics.b(str, C0098n.a().h)) {
                        c4068d.setValue(Boolean.TRUE);
                    }
                    if (length > 24) {
                        if (((Boolean) c4068d.a.getValue()).booleanValue()) {
                            Sk.w wVar3 = Qk.c0.a;
                            Intrinsics.checkNotNullParameter(f, "<this>");
                            AbstractC5709r0.j((Zn.L) Qk.c0.A.getValue(), 6);
                        }
                        if (((f2.w) c4068d2.a.getValue()).a.b.length() <= str.length()) {
                            wVar = (f2.w) c4068d2.a.getValue();
                        }
                        c4068d2.setValue(wVar);
                    } else {
                        c4068d2.setValue(wVar);
                        boolean z2 = C2978a.a;
                        C2978a.a("AccountProfilePage", null, new Aj.t0(21, c4068d2));
                    }
                    break;
                }
                break;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                if (((Float) obj).floatValue() == 0.0f && ((C2606q) c4068d2.a.getValue()) == null) {
                    c4068d.setValue(null);
                }
                break;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                y1.d dVar = (y1.d) obj;
                Intrinsics.checkNotNullParameter(dVar, "$this$drawBehind");
                c4068d2.getValue();
                ((kh.y) c4068d.a.getValue()).s.invoke(dVar);
                break;
            case 5:
                n2.l lVar3 = (n2.l) obj;
                long j = lVar3.a;
                int i2 = (int) (j >> 32);
                if (i2 != ((int) (((n2.l) c4068d2.a.getValue()).a >> 32)) || ((int) (j & 4294967295L)) != ((int) (((n2.l) c4068d2.a.getValue()).a & 4294967295L))) {
                    c4068d2.setValue(lVar3);
                    kh.y yVar = (kh.y) c4068d.a.getValue();
                    int i3 = (int) (j & 4294967295L);
                    yVar.c = i2;
                    yVar.d = i3;
                    C2978a.c("ImageEditor", new C1372l(i2, i3, 3));
                }
                break;
            case 6:
                J1.l lVar4 = (J1.l) obj;
                Intrinsics.checkNotNullParameter(lVar4, "it");
                if (lVar4.a.size() <= 1) {
                    Boolean bool = Boolean.FALSE;
                    c4068d2.setValue(bool);
                    ArrayList arrayList = kh.q.a;
                    c4068d.setValue(bool);
                }
                break;
            case 7:
                y1.d dVar2 = (y1.d) obj;
                Intrinsics.checkNotNullParameter(dVar2, "$this$drawBehind");
                c4068d2.getValue();
                ((lh.q) c4068d.a.getValue()).L.invoke(dVar2);
                break;
            default:
                n2.l lVar5 = (n2.l) obj;
                long j2 = lVar5.a;
                int i4 = (int) (j2 >> 32);
                if (i4 != ((int) (((n2.l) c4068d2.a.getValue()).a >> 32)) || ((int) (j2 & 4294967295L)) != ((int) (((n2.l) c4068d2.a.getValue()).a & 4294967295L))) {
                    c4068d2.setValue(lVar5);
                    lh.q qVar = (lh.q) c4068d.a.getValue();
                    qVar.a = i4;
                    qVar.b = (int) (j2 & 4294967295L);
                    qVar.b();
                    qVar.c();
                }
                break;
        }
        return Unit.a;
    }
}
