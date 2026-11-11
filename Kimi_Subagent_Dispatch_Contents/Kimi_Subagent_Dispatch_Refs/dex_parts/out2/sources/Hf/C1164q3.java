package Hf;

import Dc.C0568n;
import Dc.W5;
import Uc.C2011a3;
import Vc.C2163v;
import ag.AbstractC2393b;
import bc.C2424a;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import je.C3695k0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ld.AbstractC3834A;
import ld.C3843J;
import ld.C3869v;
import ld.C3870w;
import ng.C4068d;
import qi.C4277e;
import ue.C4801l;

/* JADX INFO: renamed from: Hf.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1164q3 implements Pm.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ A3 b;

    public /* synthetic */ C1164q3(A3 a3, int i) {
        this.a = i;
        this.b = a3;
    }

    public final Object emit(Object obj, Vk.a aVar) {
        String str;
        int i = this.a;
        boolean z = false;
        Object obj2 = null;
        A3 a3 = this.b;
        switch (i) {
            case 0:
                ((C4068d) a3.j.y0.e).setValue((C2163v) obj);
                return Unit.a;
            case 1:
                Map map = (Map) obj;
                W5 w5 = a3.j.y0;
                w5.getClass();
                Intrinsics.checkNotNullParameter(map, "<set-?>");
                ((C4068d) w5.f).setValue(map);
                return Unit.a;
            case 2:
                Map map2 = (Map) obj;
                W5 w52 = a3.j.y0;
                w52.getClass();
                Intrinsics.checkNotNullParameter(map2, "<set-?>");
                ((C4068d) w52.h).setValue(map2);
                return Unit.a;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                C2011a3 c2011a3 = (C2011a3) obj;
                String str2 = c2011a3.a;
                AbstractC3834A abstractC3834A = c2011a3.c;
                String str3 = c2011a3.b;
                if (str2.length() > 0) {
                    Cf.P3 p3 = a3.j;
                    if (str2.equals(p3.p().a)) {
                        String str4 = p3.y0.f().b;
                        Ae.f fVar = Ae.f.a;
                        C3843J c3843jC = Ae.f.c(str2, str3);
                        AbstractC3834A abstractC3834A2 = c3843jC != null ? c3843jC.f : null;
                        if (str3.length() > 0 && str3.equals(str4) && !Intrinsics.b(abstractC3834A2, abstractC3834A)) {
                            if (!Intrinsics.b(abstractC3834A, C3870w.d) && !Intrinsics.b(abstractC3834A, C3869v.d)) {
                                z = true;
                            }
                            C4801l c4801l = a3.k.k.n;
                            c4801l.getClass();
                            Intrinsics.checkNotNullParameter(str3, "agentId");
                            P1.f0 f0Var = c4801l.c;
                            f0Var.getClass();
                            Intrinsics.checkNotNullParameter(str3, "agentId");
                            C4277e c4277e = (C4277e) f0Var.g;
                            if (c4277e == null) {
                                Intrinsics.l("onEvent");
                                throw null;
                            }
                            c4277e.invoke(new ze.S(str3, z));
                        }
                        Ae.f.e(p3.p(), (4 & 2) == 0, (4 & 4) != 0);
                    }
                }
                return Unit.a;
            default:
                ze.a0 a0Var = (ze.a0) obj;
                Cf.P3 p32 = a3.j;
                if (a0Var instanceof ze.D) {
                    Gf.E1 e1D = p32.y0.d();
                    String str5 = e1D.a;
                    ze.D d = (ze.D) a0Var;
                    C3695k0 c3695k0 = d.d;
                    C0568n c0568n = d.f;
                    if (Intrinsics.b(str5, c3695k0.a.a) && Intrinsics.b(e1D.b, d.e.a) && e1D.e.length() == 0 && c0568n.p().c().a.length() > 0) {
                        C3695k0 c3695k02 = d.d;
                        int i2 = A3.m;
                        a3.H(c3695k02, c0568n);
                    }
                } else if (a0Var instanceof ze.N) {
                    ze.N n = (ze.N) a0Var;
                    String str6 = a3.l;
                    Cf.S3 s3 = a3.k;
                    C3695k0 c3695k03 = n.d;
                    C3695k0 c3695k04 = n.d;
                    C0568n c0568n2 = n.e;
                    Dc.N n2 = c3695k03.a;
                    C3695k0 c3695k05 = C3695k0.h;
                    if (c3695k03.v(true) && n.f && !Pf.B.w()) {
                        boolean zK = AbstractC2393b.a.k(str6, false);
                        String str7 = c3695k03.u() ? "OKC" : BuildConfig.FLAVOR;
                        if (!zK) {
                            a3.A(new Aj.S(str7, 5));
                            Intrinsics.checkNotNullParameter("open_notification", "name");
                            Y6.k kVarC = A8.b.c("custom", "type", "msh_popup_show", "popup_name", "open_notification");
                            kVarC.y("custom", "popup_type");
                            kVarC.v();
                            AbstractC2393b.a.q(str6, true);
                        }
                    }
                    String str8 = n2.a;
                    String str9 = c0568n2.a;
                    W5 w53 = p32.y0;
                    W5 w54 = p32.y0;
                    String str10 = w53.c().b;
                    if (StringsKt.W(str8) || StringsKt.W(str9) || !w54.c().c || !str8.equals(w54.c().a)) {
                        return Unit.a;
                    }
                    List list = n2.m;
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            C0568n c0568n3 = (C0568n) objPrevious;
                            if (!Intrinsics.b(c0568n3.a, str9) && c0568n3.i()) {
                                obj2 = objPrevious;
                            }
                        }
                    }
                    C0568n c0568n4 = (C0568n) obj2;
                    C2424a c2424a = Zd.B.b;
                    String str11 = c0568n2.p().b;
                    c2424a.getClass();
                    Zd.B bK = C2424a.k(str11);
                    if (c0568n2.i() && (bK.e() || c0568n4 == null)) {
                        Object objK = s3.K(new Cf.A0(c3695k04, c0568n2, true, 24), aVar);
                        return objK == Wk.a.a ? objK : Unit.a;
                    }
                    if (c0568n4 != null && (str = c0568n4.a) != null && str.length() > 0 && !str.equals(str10)) {
                        Object objK2 = s3.K(new Cf.A0(c3695k04, c0568n4, true, 24), aVar);
                        return objK2 == Wk.a.a ? objK2 : Unit.a;
                    }
                }
                return Unit.a;
        }
    }
}
