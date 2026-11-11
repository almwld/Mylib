package th;

import Ad.C0098n;
import Ad.O;
import Dc.C0639v;
import Pf.AbstractC1816b;
import Qk.F;
import Qk.z;
import Sk.w;
import W0.i0;
import W0.l3;
import a2.U;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import c1.i1;
import c1.s0;
import c1.t;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import ej.B;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qk.E;
import t0.u0;
import ub.AbstractC4718s6;
import ue.AbstractC4797h;
import ue.C4801l;
import uf.AbstractC4807e;
import ui.AbstractC4852c;
import vh.C5172c;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class r implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = 8;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        p1.o oVar = p1.o.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                String str = (String) obj2;
                Intrinsics.checkNotNullParameter(str, "message");
                Function2 function2 = s.a;
                if (function2 != null) {
                    function2.invoke(bool, str);
                }
                Rf.k kVar = Rf.k.a;
                Rf.k.e(Rf.l.d, zBooleanValue ? O.a : O.b);
                s.a = null;
                return Unit.a;
            case 1:
                t tVar = (c1.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                t tVar2 = tVar;
                if (tVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj.a.b(0.0f, 0, 0L, tVar2, null, null);
                } else {
                    tVar2.b0();
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                t tVar3 = (c1.o) obj;
                tVar3.h0(344260217);
                WeakHashMap weakHashMap = u0.v;
                t0.b bVar = t0.d.c(tVar3).e;
                tVar3.q(false);
                return bVar;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(charSequence, "s");
                return Character.valueOf(charSequence.charAt(iIntValue2));
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                E e = (E) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(e, "m");
                return Character.valueOf(e.a.charAt(iIntValue3));
            case 5:
                C4801l c4801l = (C4801l) obj;
                C0639v c0639v = (C0639v) obj2;
                Intrinsics.checkNotNullParameter(c4801l, "service");
                Intrinsics.checkNotNullParameter(c0639v, "chat");
                if (c0639v.a.length() > 0) {
                    AbstractC4797h.a.add(c4801l);
                }
                return Unit.a;
            case 6:
                Intrinsics.checkNotNullParameter((C4801l) obj, "<unused var>");
                Intrinsics.checkNotNullParameter((C0639v) obj2, "<unused var>");
                return Unit.a;
            case 7:
                Intrinsics.checkNotNullParameter((C4801l) obj, "<unused var>");
                Intrinsics.checkNotNullParameter((C0639v) obj2, "<unused var>");
                return Unit.a;
            case PushMessageReceiver.$stable /* 8 */:
                ((Integer) obj2).getClass();
                AbstractC4807e.c((c1.o) obj, c1.c.J(1));
                return Unit.a;
            case 9:
                Integer num = (Integer) obj;
                num.intValue();
                Intrinsics.checkNotNullParameter((C5172c) obj2, "<unused var>");
                return num;
            case 10:
                t tVar4 = (c1.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                t tVar5 = tVar4;
                if (tVar5.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    B.H("Search key or description", null, ((Ui.g) tVar5.j(Ui.q.a)).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, tVar5, 6, 0, 262138);
                } else {
                    tVar5.b0();
                }
                return Unit.a;
            case 11:
                t tVar6 = (c1.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                t tVar7 = tVar6;
                if (tVar7.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    F f = F.a;
                    w wVar = Qk.m.a;
                    Intrinsics.checkNotNullParameter(f, "<this>");
                    i0.a(Zn.n.b((Zn.f) Qk.m.s0.getValue(), tVar7, 0), BuildConfig.FLAVOR, (p1.r) null, ((Ui.g) tVar7.j(Ui.q.a)).A(), tVar7, 48, 4);
                } else {
                    tVar7.b0();
                }
                return Unit.a;
            case 12:
                t tVar8 = (c1.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                t tVar9 = tVar8;
                if (tVar9.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    B.H("Value", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, tVar9, 6, 0, 262142);
                } else {
                    tVar9.b0();
                }
                return Unit.a;
            case 13:
                t tVar10 = (c1.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                t tVar11 = tVar10;
                if (tVar11.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    B.H("输入缓存 key", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, tVar11, 6, 0, 262142);
                } else {
                    tVar11.b0();
                }
                return Unit.a;
            case 14:
                t tVar12 = (c1.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                t tVar13 = tVar12;
                if (!tVar13.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tVar13.b0();
                }
                return Unit.a;
            case 15:
                t tVar14 = (c1.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                t tVar15 = tVar14;
                if (tVar15.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar15, 0);
                    int iHashCode = Long.hashCode(tVar15.T);
                    s0 s0VarL = tVar15.l();
                    p1.r rVarD = p1.a.d(tVar15, oVar);
                    P1.k.R0.getClass();
                    P1.i iVar = P1.j.b;
                    if (tVar15.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar15.l0();
                    if (tVar15.S) {
                        tVar15.k(iVar);
                    } else {
                        tVar15.v0();
                    }
                    c1.c.G(tVar15, sVarA, P1.j.f);
                    c1.c.G(tVar15, s0VarL, P1.j.e);
                    P1.h hVar = P1.j.g;
                    if (tVar15.S || !Intrinsics.b(tVar15.T(), Integer.valueOf(iHashCode))) {
                        A8.b.r(iHashCode, tVar15, iHashCode, hVar);
                    }
                    c1.c.G(tVar15, rVarD, P1.j.d);
                    String str2 = AbstractC1816b.g;
                    if (str2 == null) {
                        Intrinsics.l("appFullVersion");
                        throw null;
                    }
                    AbstractC4852c.p(null, "appVersion:", str2, tVar15, 48);
                    float f2 = 4;
                    t0.e.d(tVar15, androidx.compose.foundation.layout.d.f(oVar, f2));
                    AbstractC4852c.p(null, "ssid:", Pf.B.s(), tVar15, 48);
                    t0.e.d(tVar15, androidx.compose.foundation.layout.d.f(oVar, f2));
                    AbstractC4852c.p(null, "did: ", Pf.B.r(), tVar15, 48);
                    t0.e.d(tVar15, androidx.compose.foundation.layout.d.f(oVar, f2));
                    AbstractC4852c.p(null, "JPushRegistrationID:", Pf.B.k(), tVar15, 48);
                    t0.e.d(tVar15, androidx.compose.foundation.layout.d.f(oVar, f2));
                    C0098n c0098n = C0098n.a;
                    AbstractC4852c.p(null, "UserId(uid): ", C0098n.d(), tVar15, 48);
                    t0.e.d(tVar15, androidx.compose.foundation.layout.d.f(oVar, f2));
                    AbstractC4852c.p(null, "AccessToken: ", C0098n.b().a, tVar15, 48);
                    t0.e.d(tVar15, androidx.compose.foundation.layout.d.f(oVar, f2));
                    AbstractC4852c.p(null, "RefreshToken: ", C0098n.b().e, tVar15, 48);
                    tVar15.q(true);
                } else {
                    tVar15.b0();
                }
                return Unit.a;
            case 16:
                t tVar16 = (c1.o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                t tVar17 = tVar16;
                if (tVar17.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    t0.s sVarA2 = t0.r.a(t0.j.c, p1.c.m, tVar17, 0);
                    int iHashCode2 = Long.hashCode(tVar17.T);
                    s0 s0VarL2 = tVar17.l();
                    p1.r rVarD2 = p1.a.d(tVar17, oVar);
                    P1.k.R0.getClass();
                    P1.i iVar2 = P1.j.b;
                    if (tVar17.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar17.l0();
                    if (tVar17.S) {
                        tVar17.k(iVar2);
                    } else {
                        tVar17.v0();
                    }
                    c1.c.G(tVar17, sVarA2, P1.j.f);
                    c1.c.G(tVar17, s0VarL2, P1.j.e);
                    P1.h hVar2 = P1.j.g;
                    if (tVar17.S || !Intrinsics.b(tVar17.T(), Integer.valueOf(iHashCode2))) {
                        A8.b.r(iHashCode2, tVar17, iHashCode2, hVar2);
                    }
                    c1.c.G(tVar17, rVarD2, P1.j.d);
                    AbstractC4852c.p(null, "BUILD_TIME:", " 2026-07-16_19:24:20", tVar17, 48);
                    float f3 = 4;
                    t0.e.d(tVar17, androidx.compose.foundation.layout.d.f(oVar, f3));
                    AbstractC4852c.p(null, "BRANCH_INFO:", " release", tVar17, 48);
                    t0.e.d(tVar17, androidx.compose.foundation.layout.d.f(oVar, f3));
                    AbstractC4852c.p(null, "GIT_LOG:", "\nc0b1602cd Update versionCode to 357\n6e36db6fa fix ui\n25ee24f3e 处理下打电话的兼容逻辑\n", tVar17, 48);
                    tVar17.q(true);
                } else {
                    tVar17.b0();
                }
                return Unit.a;
            case 17:
                t tVar18 = (c1.o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                t tVar19 = tVar18;
                if (tVar19.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i0.a(Zn.n.b(Qk.d.l(), tVar19, 0), (String) null, (p1.r) null, ((Ui.g) tVar19.j(Ui.q.a)).c(), tVar19, 48, 4);
                } else {
                    tVar19.b0();
                }
                return Unit.a;
            case 18:
                t tVar20 = (c1.o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                t tVar21 = tVar20;
                if (tVar21.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    i0.a(Zn.n.b(z.j(), tVar21, 0), (String) null, (p1.r) null, ((Ui.g) tVar21.j(Ui.q.a)).c(), tVar21, 48, 4);
                } else {
                    tVar21.b0();
                }
                return Unit.a;
            case 19:
                t tVar22 = (c1.o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                t tVar23 = tVar22;
                if (tVar23.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar23, 0), (String) null, (p1.r) null, ((Ui.g) tVar23.j(Ui.q.a)).c(), tVar23, 48, 4);
                } else {
                    tVar23.b0();
                }
                return Unit.a;
            case 20:
                t tVar24 = (c1.o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                t tVar25 = tVar24;
                if (tVar25.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar25, 0), (String) null, (p1.r) null, ((Ui.g) tVar25.j(Ui.q.a)).c(), tVar25, 48, 4);
                } else {
                    tVar25.b0();
                }
                return Unit.a;
            case 21:
                t tVar26 = (c1.o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                t tVar27 = tVar26;
                if (tVar27.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar27, 0), (String) null, (p1.r) null, ((Ui.g) tVar27.j(Ui.q.a)).c(), tVar27, 48, 4);
                } else {
                    tVar27.b0();
                }
                return Unit.a;
            case 22:
                t tVar28 = (c1.o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                t tVar29 = tVar28;
                if (tVar29.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar29, 0), (String) null, (p1.r) null, ((Ui.g) tVar29.j(Ui.q.a)).C(), tVar29, 48, 4);
                } else {
                    tVar29.b0();
                }
                return Unit.a;
            case 23:
                t tVar30 = (c1.o) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                t tVar31 = tVar30;
                if (tVar31.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar31, 0), (String) null, (p1.r) null, ((Ui.g) tVar31.j(Ui.q.a)).C(), tVar31, 48, 4);
                } else {
                    tVar31.b0();
                }
                return Unit.a;
            case 24:
                t tVar32 = (c1.o) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                t tVar33 = tVar32;
                if (tVar33.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar33, 0), (String) null, (p1.r) null, ((Ui.g) tVar33.j(Ui.q.a)).C(), tVar33, 48, 4);
                } else {
                    tVar33.b0();
                }
                return Unit.a;
            case 25:
                t tVar34 = (c1.o) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                t tVar35 = tVar34;
                if (tVar35.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    i0.a(Zn.n.b(z.i(), tVar35, 0), (String) null, (p1.r) null, ((Ui.g) tVar35.j(Ui.q.a)).C(), tVar35, 48, 4);
                } else {
                    tVar35.b0();
                }
                return Unit.a;
            case 26:
                t tVar36 = (c1.o) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                t tVar37 = tVar36;
                if (tVar37.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    i0.a(Zn.n.b(Qk.d.l(), tVar37, 0), (String) null, (p1.r) null, ((Ui.g) tVar37.j(Ui.q.a)).q(), tVar37, 48, 4);
                } else {
                    tVar37.b0();
                }
                return Unit.a;
            case 27:
                t tVar38 = (c1.o) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                t tVar39 = tVar38;
                if (tVar39.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    p1.o oVar2 = p1.o.a;
                    p1.r rVarD3 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
                    t0.s sVarA3 = t0.r.a(t0.j.c, p1.c.m, tVar39, 0);
                    int iHashCode3 = Long.hashCode(tVar39.T);
                    s0 s0VarL3 = tVar39.l();
                    p1.r rVarD4 = p1.a.d(tVar39, rVarD3);
                    P1.k.R0.getClass();
                    P1.i iVar3 = P1.j.b;
                    if (tVar39.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar39.l0();
                    if (tVar39.S) {
                        tVar39.k(iVar3);
                    } else {
                        tVar39.v0();
                    }
                    c1.c.G(tVar39, sVarA3, P1.j.f);
                    c1.c.G(tVar39, s0VarL3, P1.j.e);
                    P1.h hVar3 = P1.j.g;
                    if (tVar39.S || !Intrinsics.b(tVar39.T(), Integer.valueOf(iHashCode3))) {
                        A8.b.r(iHashCode3, tVar39, iHashCode3, hVar3);
                    }
                    c1.c.G(tVar39, rVarD4, P1.j.d);
                    i1 i1Var = Ui.q.c;
                    U u = ((Ui.e) tVar39.j(i1Var)).e;
                    i1 i1Var2 = Ui.q.a;
                    float f4 = 20;
                    B.H("这里是标题部分", androidx.compose.foundation.layout.a.r(oVar2, 0.0f, f4, 0.0f, 8, 5).then(new HorizontalAlignElement(p1.c.n)), ((Ui.g) tVar39.j(i1Var2)).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, u, tVar39, 6, 0, 131064);
                    B.H("描述应是简短、完整的句子描述应是简短、完整的句子描述", androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 0.0f, 0.0f, f4, 7), 1.0f), ((Ui.g) tVar39.j(i1Var2)).C(), 0L, null, null, 0L, new l2.k(3), 0L, 0, false, 0, 0, ((Ui.e) tVar39.j(i1Var)).h, tVar39, 54, 0, 130040);
                    tVar39.q(true);
                } else {
                    tVar39.b0();
                }
                return Unit.a;
            case 28:
                t tVar40 = (c1.o) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                t tVar41 = tVar40;
                if (tVar41.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    float f5 = 10;
                    l3.b("这是一段很长很长很长很长很长的的提示", androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(AbstractC4718s6.b(oVar, C0.f.b(f5)), w1.s.d, C0.f.b(f5)), 12, 8), 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 0, false, 0, 0, (U) null, tVar41, 6, 0, 262140);
                } else {
                    tVar41.b0();
                }
                return Unit.a;
            default:
                t tVar42 = (c1.o) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                t tVar43 = tVar42;
                if (tVar43.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    float f6 = 10;
                    l3.b("这是一段很长很长很长很长很长的的提示", androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(AbstractC4718s6.b(oVar, C0.f.b(f6)), w1.s.d, C0.f.b(f6)), 12, 8), 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 0, false, 0, 0, (U) null, tVar43, 6, 0, 262140);
                } else {
                    tVar43.b0();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ r(int i, byte b) {
        this.a = i;
    }
}
