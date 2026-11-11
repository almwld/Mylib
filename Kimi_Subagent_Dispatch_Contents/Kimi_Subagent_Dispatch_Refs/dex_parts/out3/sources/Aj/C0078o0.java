package Aj;

import Cf.K6;
import Cf.P3;
import Cf.T5;
import Cf.y6;
import Dc.W5;
import Dc.Z6;
import Dc.h7;
import Hf.x4;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.FillElement;
import com.moonshot.kimichat.webview.KimiVideoWebViewActivity;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nl.InterfaceC1197g;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import ub.B6;
import ub.k6;
import ub.m6;
import ub.q5;
import ub.s6;
import ub.x6;
import ub.z6;
import vb.b4;

/* JADX INFO: renamed from: Aj.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final /* synthetic */ class C0078o0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0078o0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        p1.o oVar = p1.o.a;
        Object obj3 = c1.n.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0048h.n((kn.n) obj5, (Function0) obj4, (c1.o) obj, c1.c.J(1));
                return Unit.a;
            case 1:
                B5.a aVar = (B5.a) obj5;
                Ad.f fVar = (Ad.f) obj4;
                c1.t tVar = (c1.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c1.t tVar2 = tVar;
                if (tVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.invoke(fVar.invoke(tVar2, 0));
                } else {
                    tVar2.b0();
                }
                return Unit.a;
            case 2:
                Bd.n nVar = (Bd.n) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String msg = (String) obj2;
                Intrinsics.checkNotNullParameter(msg, "msg");
                ((uh.p) obj5).invoke();
                if (zBooleanValue) {
                    nVar.d.invoke(nVar.a, nVar.b, Boolean.valueOf(nVar.c));
                    Bd.m[] mVarArr = Bd.m.a;
                    Y6.k kVarC = A8.b.c("phone", TeXSymbolParser.TYPE_ATTR, "login_phone_change_success", "enter_from", "account_security_page");
                    kVarC.y("phone", "msh_login_type");
                    kVarC.v();
                } else {
                    nVar.e.invoke(msg);
                    Bd.m[] mVarArr2 = Bd.m.a;
                    Y6.k kVarA = A8.b.A("phone", TeXSymbolParser.TYPE_ATTR, msg, "failReason", "login_phone_change_fail");
                    kVarA.y("account_security_page", "enter_from");
                    s3.e.r(kVarA, "msh_login_type", "phone", "fail_reason", msg);
                }
                return Unit.a;
            case 3:
                Gf.k2 k2Var = (Gf.k2) obj4;
                Z6 z6 = (Z6) obj;
                Z6 z62 = (Z6) obj2;
                P3 p3 = ((Df.d) ((y6) obj5)).j;
                if (((Gf.k2) p3.z0.a.getValue()) == k2Var) {
                    boolean z = dg.a.a;
                    dg.a.a("qp", (Throwable) null, new T5(z6, z62, 0));
                    String messageId = k2Var.a;
                    String blockId = k2Var.b;
                    Intrinsics.checkNotNullParameter(messageId, "messageId");
                    Intrinsics.checkNotNullParameter(blockId, "blockId");
                    p3.H0(new Gf.k2(messageId, blockId, z62));
                }
                return Unit.a;
            case 4:
                y4.z zVar = (y4.z) obj5;
                he.e eVar = (he.e) obj4;
                c1.t tVar3 = (c1.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c1.t tVar4 = tVar3;
                if (tVar4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zH = tVar4.h(zVar);
                    Object objT = tVar4.T();
                    if (zH || objT == obj3) {
                        objT = new Bi.b(zVar, 3);
                        tVar4.s0(objT);
                    }
                    yd.r0.a(false, (Function0) objT, tVar4, 0, 1);
                    int i2 = he.e.o;
                    Ci.a.g(eVar, tVar4, 8);
                } else {
                    tVar4.b0();
                }
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                ((D0.D) obj5).o((k1.c) obj4, (c1.o) obj, c1.c.J(7));
                return Unit.a;
            case 6:
                Dh.g gVar = (Dh.g) obj5;
                v0.v vVar = (v0.v) obj4;
                c1.t tVar5 = (c1.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c1.t tVar6 = tVar5;
                if (tVar6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p1.r rVarP = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.c, 16, 0.0f, 2);
                    Object objT2 = tVar6.T();
                    if (objT2 == obj3) {
                        objT2 = new Bj.w(8);
                        tVar6.s0(objT2);
                    }
                    Vh.l.d(gVar, rVarP, true, (Sn.e) null, vVar, (Ih.d) null, (Function1) null, (Function2) objT2, false, (gl.l) null, tVar6, 113246640, 616);
                } else {
                    tVar6.b0();
                }
                return Unit.a;
            case 7:
                String projectName = (String) obj;
                Intrinsics.checkNotNullParameter(projectName, "projectName");
                ((Function1) obj5).invoke(new Cf.A(projectName, (String) obj2, (String) ((K6) obj4).t.a.getValue()));
                return Unit.a;
            case 8:
                Ei.l0 l0Var = (Ei.l0) obj5;
                y4.z zVar2 = (y4.z) obj4;
                c1.t tVar7 = (c1.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                c1.t tVar8 = tVar7;
                if (tVar8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zH2 = tVar8.h(zVar2);
                    Object objT3 = tVar8.T();
                    if (zH2 || objT3 == obj3) {
                        objT3 = new Bi.b(zVar2, 9);
                        tVar8.s0(objT3);
                    }
                    yd.H0.b(l0Var, (Function0) objT3, tVar8, 0);
                } else {
                    tVar8.b0();
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                Fh.M.a((p1.r) obj5, (Fh.d) obj4, (c1.o) obj, c1.c.J(1));
                return Unit.a;
            case 10:
                Dc.z1 remember = (Dc.z1) obj;
                ((Integer) obj2).getClass();
                Intrinsics.checkNotNullParameter(remember, "$this$remember");
                String chatId = ((P3) obj5).p().a;
                String str = ((bf.Q) obj4).a;
                String str2 = remember.c;
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Y6.k kVarA2 = A8.b.A(str, "msgId", str2, "sandboxUri", "msh_download_card_show");
                kVarA2.y(chatId, "msh_conversation_id");
                s3.e.r(kVarA2, "msh_message_id", str, "sandbox_path", str2);
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                q5.c((Ei.l0) obj5, (Function0) obj4, (c1.o) obj, c1.c.J(49));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                q5.a((p1.r) obj5, (Function1) obj4, (c1.o) obj, c1.c.J(1));
                return Unit.a;
            case 13:
                KimiVideoWebViewActivity kimiVideoWebViewActivity = (KimiVideoWebViewActivity) obj5;
                k1.c cVar = (k1.c) obj4;
                c1.t tVar9 = (c1.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                c1.t tVar10 = tVar9;
                if (tVar10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k6.b(true, kimiVideoWebViewActivity, cVar, tVar10, 0);
                } else {
                    tVar10.b0();
                }
                return Unit.a;
            case 14:
                P3 p32 = (P3) obj5;
                He.k kVar = (He.k) obj4;
                c1.t tVar11 = (c1.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                c1.t tVar12 = tVar11;
                if (tVar12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean z2 = p32.r().a;
                    boolean zH3 = tVar12.h(kVar);
                    Object objT4 = tVar12.T();
                    if (zH3 || objT4 == obj3) {
                        objT4 = new He.c(kVar, 0);
                        tVar12.s0(objT4);
                    }
                    yd.r0.a(z2, (Function0) objT4, tVar12, 0, 0);
                    WeakHashMap weakHashMap = t0.u0.v;
                    t0.b bVar = t0.d.c(tVar12).e;
                    int i3 = bVar.e().d;
                    p1.r rVarA = p1.a.a(androidx.compose.foundation.layout.d.c, new He.f(0));
                    N1.d0 d0VarD = t0.n.d(p1.c.h, false);
                    int iHashCode = Long.hashCode(tVar12.T);
                    c1.s0 s0VarL = tVar12.l();
                    p1.r rVarD = p1.a.d(tVar12, rVarA);
                    P1.k.R0.getClass();
                    P1.i iVar = P1.j.b;
                    if (tVar12.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar12.l0();
                    if (tVar12.S) {
                        tVar12.k(iVar);
                    } else {
                        tVar12.v0();
                    }
                    c1.c.G(tVar12, d0VarD, P1.j.f);
                    c1.c.G(tVar12, s0VarL, P1.j.e);
                    P1.h hVar = P1.j.g;
                    if (tVar12.S || !Intrinsics.b(tVar12.T(), Integer.valueOf(iHashCode))) {
                        A8.b.r(iHashCode, tVar12, iHashCode, hVar);
                    }
                    c1.c.G(tVar12, rVarD, P1.j.d);
                    p1.r rVarA2 = androidx.compose.foundation.layout.b.a.a(oVar, p1.c.a);
                    float fO = aj.q.O(tVar12, i3);
                    Pm.h0 h0Var = Hd.r.h;
                    m6.a(kVar, rVarA2, fO, tVar12, 8);
                    c1.E e = aj.I.j;
                    boolean zH4 = tVar12.h(kVar);
                    Object objT5 = tVar12.T();
                    if (zH4 || objT5 == obj3) {
                        objT5 = new D0.h1(1, kVar, He.k.class, "take", "take(Lcom/moonshot/kimichat/base/Event;)V", 0, 4);
                        tVar12.s0(objT5);
                    }
                    c1.c.a(e.a((InterfaceC1197g) objT5), k1.h.d(1768170536, new Ge.a(p32, i3, 3), tVar12), tVar12, 56);
                    tVar12.q(true);
                } else {
                    tVar12.b0();
                }
                return Unit.a;
            case 15:
                P3 p33 = (P3) obj5;
                h7 h7Var = (h7) obj4;
                if (((Ri.C) obj) == Ri.C.n) {
                    m6.c(p33, "pay", h7Var.a().a().a());
                }
                return Unit.a;
            case 16:
                Gf.E1 e1 = (Gf.E1) obj4;
                Z6 raw = (Z6) obj;
                Z6 z63 = (Z6) obj2;
                Intrinsics.checkNotNullParameter(raw, "raw");
                Intrinsics.checkNotNullParameter(z63, "new");
                P3 p34 = ((Df.d) ((Hf.A3) obj5)).j;
                if (p34.y0.d() == e1) {
                    boolean z3 = dg.a.a;
                    dg.a.a("qp", (Throwable) null, new T5(raw, z63, 2));
                    p34.y0.i(Gf.E1.a(e1, (String) null, (String) null, (Gf.D1) null, (String) null, (String) null, z63, 31));
                }
                return Unit.a;
            case 17:
                Gf.F1 f1 = (Gf.F1) obj4;
                Z6 raw2 = (Z6) obj;
                Z6 z64 = (Z6) obj2;
                Intrinsics.checkNotNullParameter(raw2, "raw");
                Intrinsics.checkNotNullParameter(z64, "new");
                P3 p35 = ((Df.d) ((Hf.A3) obj5)).j;
                if (p35.y0.c() == f1) {
                    boolean z4 = dg.a.a;
                    dg.a.a("qp", (Throwable) null, new T5(raw2, z64, 1));
                    W5 w5 = p35.y0;
                    String messageId2 = f1.a;
                    String blockId2 = f1.b;
                    boolean z5 = f1.c;
                    boolean z7 = f1.d;
                    String swarmAgentId = f1.f;
                    Intrinsics.checkNotNullParameter(messageId2, "messageId");
                    Intrinsics.checkNotNullParameter(blockId2, "blockId");
                    Intrinsics.checkNotNullParameter(swarmAgentId, "swarmAgentId");
                    w5.g(new Gf.F1(messageId2, blockId2, z5, z7, z64, swarmAgentId));
                }
                return Unit.a;
            case 18:
                Gf.j2 j2Var = (Gf.j2) obj4;
                Z6 z65 = (Z6) obj2;
                Intrinsics.checkNotNullParameter((Z6) obj, "raw");
                Intrinsics.checkNotNullParameter(z65, "new");
                P3 p36 = ((Df.d) ((Hf.A3) obj5)).j;
                if (p36.y0.f() == j2Var) {
                    p36.y0.k(Gf.j2.a(j2Var, (Gf.D1) null, (String) null, z65, 15));
                }
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                x6.b((Hi.j0) obj5, (Function0) obj4, (c1.o) obj, c1.c.J(7));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                ((g9.a) obj5).o((k1.c) obj4, (c1.o) obj, c1.c.J(7));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                ((H7.a) obj5).o((k1.c) obj4, (c1.o) obj, c1.c.J(7));
                return Unit.a;
            case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                ((Integer) obj2).getClass();
                z6.i((Hi.j0) obj5, (Function1) obj4, (c1.o) obj, c1.c.J(7));
                return Unit.a;
            case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                ((Integer) obj2).getClass();
                ((Hi.B) obj5).o((k1.c) obj4, (c1.o) obj, c1.c.J(7));
                return Unit.a;
            case 24:
                Hi.j0 j0Var = (Hi.j0) obj5;
                Hi.w0 w0Var = (Hi.w0) obj4;
                c1.t tVar13 = (c1.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                c1.t tVar14 = tVar13;
                if (tVar14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zF = tVar14.f(j0Var);
                    Object objT6 = tVar14.T();
                    if (zF || objT6 == obj3) {
                        objT6 = new Hi.e0(j0Var, 1);
                        tVar14.s0(objT6);
                    }
                    yd.r0.a(false, (Function0) objT6, tVar14, 0, 1);
                    p1.r rVarC = s6.c(oVar);
                    FillElement fillElement = androidx.compose.foundation.layout.d.c;
                    p1.r rVarP2 = androidx.compose.foundation.layout.a.p(rVarC.then(fillElement), 16, 0.0f, 2);
                    t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar14, 0);
                    int iHashCode2 = Long.hashCode(tVar14.T);
                    c1.s0 s0VarL2 = tVar14.l();
                    p1.r rVarD2 = p1.a.d(tVar14, rVarP2);
                    P1.k.R0.getClass();
                    P1.i iVar2 = P1.j.b;
                    if (tVar14.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar14.l0();
                    if (tVar14.S) {
                        tVar14.k(iVar2);
                    } else {
                        tVar14.v0();
                    }
                    c1.c.G(tVar14, sVarA, P1.j.f);
                    c1.c.G(tVar14, s0VarL2, P1.j.e);
                    P1.h hVar2 = P1.j.g;
                    if (tVar14.S || !Intrinsics.b(tVar14.T(), Integer.valueOf(iHashCode2))) {
                        A8.b.r(iHashCode2, tVar14, iHashCode2, hVar2);
                    }
                    c1.c.G(tVar14, rVarD2, P1.j.d);
                    Hi.d dVar = (Hi.d) w0Var.j.g.a.getValue();
                    if (Intrinsics.b(dVar, Hi.b.a)) {
                        tVar14.h0(-1668899867);
                        B6.c(tVar14, 0);
                        tVar14.q(false);
                    } else if (Intrinsics.b(dVar, Hi.a.a)) {
                        tVar14.h0(-1668898286);
                        boolean zH5 = tVar14.h(w0Var);
                        Object objT7 = tVar14.T();
                        if (zH5 || objT7 == obj3) {
                            objT7 = new x4(5, w0Var);
                            tVar14.s0(objT7);
                        }
                        B6.a((Function0) objT7, tVar14, 0);
                        tVar14.q(false);
                    } else {
                        if (!Intrinsics.b(dVar, Hi.c.a)) {
                            throw S0.b.g(tVar14, -1668901425, false);
                        }
                        tVar14.h0(-196096805);
                        Hi.Y y = Hi.Y.a;
                        Ii.f fVar2 = (Ii.f) Hi.Y.e.a.getValue();
                        boolean zH6 = tVar14.h(w0Var) | tVar14.f(j0Var);
                        Object objT8 = tVar14.T();
                        if (zH6 || objT8 == obj3) {
                            objT8 = new Hf.P(3, w0Var, j0Var);
                            tVar14.s0(objT8);
                        }
                        Function1 function1 = (Function1) objT8;
                        Object objT9 = tVar14.T();
                        if (objT9 == obj3) {
                            objT9 = new Hd.s(9);
                            tVar14.s0(objT9);
                        }
                        Function1 function12 = (Function1) objT9;
                        Object objT10 = tVar14.T();
                        if (objT10 == obj3) {
                            objT10 = new Hd.s(10);
                            tVar14.s0(objT10);
                        }
                        Function1 function13 = (Function1) objT10;
                        int i4 = Hi.w0.k;
                        Ii.e eVar2 = Ii.f.Companion;
                        z6.h(w0Var, fillElement, fVar2, false, 5, function1, function12, function13, tVar14, 14183992, 0);
                        tVar14.q(false);
                    }
                    tVar14.q(true);
                } else {
                    tVar14.b0();
                }
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                I0.n.a((G0.g) obj5, (G0.c) obj4, (c1.o) obj, c1.c.J(1));
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                ((I0.r) obj5).a((Drawable) obj4, (c1.o) obj, c1.c.J(49));
                return Unit.a;
            case 27:
                Ch.k kVar2 = (Ch.k) obj5;
                c1.h1 h1Var = (c1.h1) obj4;
                c1.t tVar15 = (c1.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                c1.t tVar16 = tVar15;
                if (tVar16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Ch.j.a((p1.r) null, (Dh.g) h1Var.getValue(), kVar2, true, (Lh.c) null, (Lh.g) null, (Lh.f) null, (Lh.d) null, (Lh.h) null, Ch.a.d(new Bj.w(22), tVar16, 0), (Map) null, (v0.v) null, (Sn.e) null, (Function1) null, (Function2) null, (Function1) null, (Function2) null, (a2.K) null, tVar16, 3072, 0, 261617);
                } else {
                    tVar16.b0();
                }
                return Unit.a;
            case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                Zd.D d = (Zd.D) obj5;
                Zd.E e2 = (Zd.E) obj4;
                c1.t tVar17 = (c1.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                c1.t tVar18 = tVar17;
                if (tVar18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p1.r rVarN = androidx.compose.foundation.layout.d.n(oVar, 20);
                    String str3 = d.a;
                    yd.H0.f(rVarN, ej.B.w0(str3.length() > 0 ? b4.b(str3) : "", !e2.d() && str3.length() > 0, d.b, ((Ui.g) tVar18.j(Ui.q.a)).E(), (N1.r) null, tVar18, 0, 496), tVar18, 6);
                } else {
                    tVar18.b0();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                Ie.D.D((P3) obj5, (ArrayList) obj4, (c1.o) obj, c1.c.J(1));
                return Unit.a;
        }
    }

    public /* synthetic */ C0078o0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
