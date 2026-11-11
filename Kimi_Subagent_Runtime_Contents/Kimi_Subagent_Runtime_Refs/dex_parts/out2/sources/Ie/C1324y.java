package Ie;

import Ad.C0098n;
import Dc.C0629t7;
import Dc.D2;
import Dc.K7;
import Ld.C1397l;
import Mg.AbstractC1598a;
import Pi.C1827c0;
import af.C2384e;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.KimiApplication;
import com.moonshot.kimichat.push.PushMessageReceiver;
import dg.C2978a;
import di.C2993a0;
import di.C3058w0;
import eb.AbstractC3074e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import je.C3711s0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ld.AbstractC3834A;
import ld.C3843J;
import ld.C3869v;
import ng.C4066b;
import ng.C4068d;
import tg.C4524h;
import ub.F6;
import ub.H6;
import ub.T5;
import vd.C5044I;
import vd.C5085q;
import vg.C5169c;
import wd.B2;
import wd.C5248f0;
import xg.C5607W;
import xg.C5617j;
import xg.C5630w;

/* JADX INFO: renamed from: Ie.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C1324y implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1324y(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        AbstractC3834A abstractC3834A;
        String str;
        N0.H0 h0;
        int i = this.a;
        int i2 = -1;
        int i3 = 2;
        String string = BuildConfig.FLAVOR;
        int i4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y4.z zVar = (y4.z) obj2;
                C3711s0 c3711s0 = (C3711s0) obj;
                try {
                    Zf.f fVar = Zf.f.a;
                    kn.t tVar = Zf.f.c;
                    tVar.getClass();
                    string = tVar.b(C3711s0.Companion.serializer(), c3711s0).toString();
                    break;
                } catch (Throwable th2) {
                    boolean z = C2978a.a;
                    C2978a.b("KimiJson", null, new Ad.W(th2, c3711s0, 8));
                }
                H6.l(zVar, new C3058w0(string), null, 6);
                return Unit.a;
            case 1:
                Ae.f fVar2 = Ae.f.a;
                C3843J c3843jC = Ae.f.c((String) obj2, ((K7) obj).a);
                return (c3843jC == null || (abstractC3834A = c3843jC.f) == null) ? C3869v.d : abstractC3834A;
            case 2:
                return Boolean.valueOf(((c1.d0) obj).j() != 4 && ((bf.Q) obj2).b);
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                List list = (List) obj2;
                z1 z1Var = (z1) obj;
                if (list.size() == 1) {
                    C0629t7 c0629t7 = (C0629t7) CollectionsKt.firstOrNull(list);
                    yd.H0.x(new zj.d(1022, (c0629t7 == null || (str = c0629t7.a) == null) ? BuildConfig.FLAVOR : str, (String) null, (String) null, (String) null, false));
                } else if (!list.isEmpty()) {
                    z1Var.b(!z1Var.a());
                }
                return Unit.a;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                C5607W c5607w = (C5607W) obj2;
                if (((Boolean) ((c1.h1) obj).getValue()).booleanValue()) {
                    c5607w.n.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 5:
                int i5 = ((C5169c) obj2).a;
                Hg.f fVar3 = Hg.f.a;
                B2 b2 = new B2(null, null, null, 31);
                Zf.j jVar = new Zf.j();
                jVar.n(i5, "message_num");
                Hg.f.k(fVar3, "discovery_feed_message_click", "discovery", "click", null, null, null, jVar, 0L, b2, 184);
                ((Function0) obj).invoke();
                return Unit.a;
            case 6:
                C5607W c5607w2 = (C5607W) obj;
                Jc.b bVar = bh.t.a;
                bh.t.f("discovery", BuildConfig.FLAVOR);
                Hg.f fVar4 = Hg.f.a;
                KimiApplication kimiApplication = Pf.B.a;
                Hg.f.b = System.currentTimeMillis();
                Y6.k kVarS = Hg.f.s(fVar4, "discovery_page_view", null, null, null, null, null, 62);
                kVarS.y("page_view", "action");
                kVarS.v();
                boolean z2 = C2978a.a;
                C2978a.a("CommunityTracker", null, new Hf.X0(9));
                Hg.f.c.clear();
                if (!((C5617j) obj2).c()) {
                    m3.a aVarI = androidx.lifecycle.Z.i(c5607w2);
                    Tm.e eVar = Mm.P.a;
                    Mm.E.z(aVarI, Tm.d.c, (Mm.C) null, new C5630w(c5607w2, false, true, null), 2);
                }
                return Unit.a;
            case 7:
                return v.z.d(((ArrayList) obj2).size() - ((ArrayList) obj).size(), "commit: 去除重复 feed 条目 ", " 条");
            case PushMessageReceiver.$stable /* 8 */:
                return S0.b.i(((C4066b) obj2).a.j() + 1, "auto retry [", "/3] key=", (String) obj);
            case 9:
                ((Function1) obj2).invoke((C5044I) obj);
                return Unit.a;
            case 10:
                Mg.B b = (Mg.B) obj2;
                C4068d c4068d = (C4068d) obj;
                C4524h c4524h = C4524h.a;
                String str2 = b.c.e().d;
                c4524h.getClass();
                B2 b2E = C4524h.e(str2);
                Hg.f fVar5 = Hg.f.a;
                String str3 = b.c.e().d;
                int iE = b2E.b().d().h.e();
                String str4 = b.e;
                Intrinsics.checkNotNullParameter(str3, "momentId");
                Intrinsics.checkNotNullParameter(str4, "page");
                B2 b22 = new B2(null, null, null, 31);
                Zf.j jVar2 = new Zf.j();
                jVar2.t("moment_id", str3);
                jVar2.n(iE, "moment_type");
                Hg.f.k(fVar5, "input_at_kimi_click", str4, "click", "input_at_kimi", null, null, jVar2, 0L, b22, 176);
                f2.w wVar = (f2.w) c4068d.a.getValue();
                String str5 = wVar.a.b;
                long j = wVar.b;
                int i6 = a2.T.c;
                int i7 = (int) (j >> 32);
                String string2 = StringsKt.h0(str5, i7, (int) (j & 4294967295L), " @Kimi ").toString();
                int i8 = i7 + 7;
                c4068d.setValue(f2.w.b(wVar, string2, a2.J.b(i8, i8), 4));
                return Unit.a;
            case 11:
                ((wg.r0) obj2).E(new Ag.r((String) obj, true));
                return Unit.a;
            case 12:
                C5248f0 c5248f0 = (C5248f0) obj;
                ((gl.l) obj2).invoke(F6.k(0, c5248f0), F6.j(0, c5248f0), BuildConfig.FLAVOR);
                return Unit.a;
            case 13:
                return "onCallStatusChanged: " + ((Rd.p) obj2) + " -> " + ((Rd.p) obj);
            case 14:
                Ld.f0.I((Ld.f0) obj2, (Function1) obj);
                return Unit.a;
            case 15:
                ((Function1) obj2).invoke((C5085q) obj);
                return Unit.a;
            case 16:
                c1.h1 h1Var = (c1.h1) obj;
                if (((j0.P) obj2).a1()) {
                    Rd.p pVar = (Rd.p) h1Var.getValue();
                    i2 = pVar instanceof Rd.k ? ((Rd.k) pVar).c : 0;
                }
                return Integer.valueOf(i2);
            case 17:
                Q1.x0 x0Var = (Q1.U0) obj2;
                Function1 function1 = (Function1) obj;
                if (x0Var != null) {
                    x0Var.a();
                }
                function1.invoke(new Ld.B(new Ld.i0(C1397l.a)));
                return Unit.a;
            case 18:
                y4.z zVar2 = (y4.z) obj2;
                C5607W c5607w3 = (C5607W) obj;
                Y6.k kVarS2 = Hg.f.s(Hg.f.a, "discovery_personal_homepage_button_click", null, null, "personal_homepage_button", null, null, 54);
                kVarS2.y("click", "action");
                kVarS2.v();
                C0098n c0098n = C0098n.a;
                if (C0098n.g()) {
                    H6.l(zVar2, new C2993a0("kimiMainContent"), null, 6);
                    return Unit.a;
                }
                H6.d(zVar2, c5607w3, "kimiMainContent", false);
                return Unit.a;
            case 19:
                wg.l0 l0Var = (wg.l0) obj2;
                if (((Boolean) ((c1.h1) obj).getValue()).booleanValue()) {
                    l0Var.l.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 20:
                N0.d0 d0Var = (N0.d0) obj2;
                kotlin.jvm.internal.G g = (kotlin.jvm.internal.G) obj;
                d0Var.t.f();
                if (((p1.q) d0Var).n && ((Q1.d1) P1.f.i(d0Var, Q1.w0.t)).a()) {
                    i3 = 1;
                }
                int i9 = g.a;
                int i10 = i3 * i9;
                g.a = i9 * (-1);
                return Integer.valueOf(i10);
            case 21:
                N0.y0 y0Var = (N0.y0) obj;
                if (!((O0.O) obj2).e) {
                    l0.S s = y0Var.A;
                    if (((p1.q) s).n) {
                        u1.u.i1(s.v);
                    }
                }
                return Unit.a;
            case 22:
                N0.J0 j0 = (N0.J0) obj2;
                return N0.T.b(j0.a.c(), (C2384e) obj, j0.e());
            case 23:
                N0.J0 j02 = (N0.J0) obj2;
                N0.T t = (N0.T) obj;
                c1.H h = j02.e;
                M0.h hVarC = (h == null || (h0 = (N0.H0) h.getValue()) == null) ? j02.a.c() : h0.a;
                N0.S sE = j02.e();
                N0.O o = new N0.O(0, (byte) 0);
                StringBuilder sb2 = new StringBuilder();
                boolean z3 = false;
                while (i4 < hVarC.c.length()) {
                    int iCodePointAt = Character.codePointAt((CharSequence) hVarC, i4);
                    t.getClass();
                    int i11 = iCodePointAt == 10 ? 32 : iCodePointAt == 13 ? 65279 : iCodePointAt;
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (i11 != iCodePointAt) {
                        o.k(sb2.length(), sb2.length() + iCharCount, Character.charCount(i11));
                        z3 = true;
                    }
                    sb2.appendCodePoint(i11);
                    i4 += iCharCount;
                }
                M0.h string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                M0.h hVar = z3 ? string3 : hVarC;
                if (hVar == hVarC) {
                    return null;
                }
                long jD = N0.T.d(hVarC.d, o, sE);
                a2.T t2 = hVarC.e;
                return new N0.H0(new M0.h(hVar, jD, t2 != null ? new a2.T(N0.T.d(t2.a, o, sE)) : null, (Pair) null, (List) null, (List) null, 56), o);
            case 24:
                C5085q c5085q = (C5085q) obj;
                boolean z4 = C2978a.a;
                C2978a.a("RecommendComment", null, new Mg.u(5, c5085q));
                AbstractC1598a.s((Mg.B) obj2, c5085q);
                return Unit.a;
            case 25:
                return "Executing local MCP tool: " + ((String) obj2) + " with arguments: " + ((kn.A) obj);
            case 26:
                Mm.E.z((Mm.B) obj2, (CoroutineContext) null, (Mm.C) null, new Oe.t((c1.f0) obj, null), 3);
                return Unit.a;
            case 27:
                return "rename new file: " + ((File) obj2) + " from file: " + ((String) obj);
            case 28:
                return K0.h(((kotlin.jvm.internal.G) obj2).a, ((kotlin.jvm.internal.G) obj).a, "parseMediaResults: query 没有获得宽高，尝试从uri获取结果：宽：", ", 高：");
            default:
                C1827c0 c1827c0 = (C1827c0) obj2;
                D2 d2 = (D2) obj;
                Nc.B0 b0 = (Nc.B0) c1827c0.y.a.getValue();
                c1827c0.n.setValue(Boolean.FALSE);
                c1827c0.y.setValue(null);
                if (b0 != null) {
                    ArrayList arrayList = Be.h.a;
                    Be.h.f("msh_kimi_claw_skill_use", d2, T5.c(b0), null, AbstractC3074e.d(b0.b()), "toast", null, null, 200);
                    c1827c0.O(T5.c(b0));
                }
                return Unit.a;
        }
    }
}
