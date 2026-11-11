package ue;

import Ag.C0157y;
import Cf.O2;
import Dc.C0639v;
import Dc.N;
import Gf.C0964a;
import Gf.a2;
import Hf.C1206x4;
import J.M0;
import Mi.q0;
import Mm.C;
import Mm.E;
import Mm.P;
import Pf.B;
import Uc.C2105w;
import W0.z3;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.Z;
import androidx.work.impl.WorkDatabase;
import bh.t;
import c1.H;
import c1.e0;
import c1.f0;
import ci.s;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.KimiApplication;
import com.moonshot.kimichat.push.PushMessageReceiver;
import di.C3049t0;
import di.Q;
import eg.C3123f;
import f2.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import je.C3695k0;
import je.C3697l0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.x;
import ng.C4068d;
import q5.r;
import ti.C4533c;
import ug.C4816f;
import ui.AbstractC4864o;
import un.u;
import un.y;
import v.A0;
import v.y0;
import v.z;
import v.z0;
import wd.B2;
import wd.C5;
import wd.C5404s0;
import wg.C5538m;
import wg.l0;
import xg.C5607W;
import xg.C5617j;

/* JADX INFO: renamed from: ue.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C4791b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C4791b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        N n;
        long jA;
        long[] jArr;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        uVarArr = null;
        u[] uVarArr = null;
        switch (this.a) {
            case 0:
                C3695k0 c3695k0 = (C3695k0) this.b;
                return "Message local status changed: " + c3695k0.a.a + " from " + ((C3697l0) this.c) + " to " + c3695k0.b;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                C3695k0 c3695k02 = (C3695k0) this.b;
                int size = arrayList.size();
                String str = (c3695k02 == null || (n = c3695k02.a) == null) ? null : n.a;
                C3695k0 c3695k03 = (C3695k0) CollectionsKt.firstOrNull(arrayList);
                String strH = c3695k03 != null ? c3695k03.H() : null;
                C3695k0 c3695k04 = (C3695k0) CollectionsKt.d0(arrayList);
                return z.i(s3.e.j(size, "Replace → size=", ", update=", str, ", first="), strH, ", last=", c3695k04 != null ? c3695k04.H() : null);
            case 2:
                return z.d(((List) this.b).size() - ((ArrayList) this.c).size(), "updateMessages: 去除重复消息 ", " 条");
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                return z.g("Chat ID changed: ", ((C0639v) ((C4801l) this.b).i.getValue()).a, " -> ", ((C0639v) this.c).a);
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                ((Function1) this.b).invoke((q0) this.c);
                return Unit.a;
            case 5:
                ((s) this.b).a(((w) ((f0) this.c).getValue()).a.b);
                AbstractC4864o.c(false);
                return Unit.a;
            case 6:
                return Boolean.valueOf(x.o(StringsKt.y0((String) ((C4068d) this.c).a.getValue()).toString(), (String) this.b, true));
            case 7:
                un.m mVar = (un.m) this.b;
                u uVar = (u) this.c;
                try {
                    mVar.a.b(uVar);
                    break;
                } catch (IOException e) {
                    xn.e eVar = xn.e.a;
                    xn.e.a.j(4, "Http2Connection.Listener failure for " + mVar.c, e);
                    try {
                        uVar.d(un.b.d, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return Unit.a;
            case PushMessageReceiver.$stable /* 8 */:
                C4533c c4533c = (C4533c) this.b;
                y yVar = (y) this.c;
                Intrinsics.checkNotNullParameter(yVar, "settings");
                I i = new I();
                un.m mVar2 = (un.m) c4533c.c;
                synchronized (mVar2.w) {
                    synchronized (mVar2) {
                        try {
                            y yVar2 = mVar2.r;
                            y yVar3 = new y();
                            yVar3.b(yVar2);
                            yVar3.b(yVar);
                            i.a = yVar3;
                            jA = ((long) yVar3.a()) - ((long) yVar2.a());
                            if (jA != 0 && !mVar2.b.isEmpty()) {
                                uVarArr = (u[]) mVar2.b.values().toArray(new u[0]);
                            }
                            y yVar4 = (y) i.a;
                            Intrinsics.checkNotNullParameter(yVar4, "<set-?>");
                            mVar2.r = yVar4;
                            qn.c.c(mVar2.j, mVar2.c + " onSettings", 0L, new C4791b(9, mVar2, i), 6);
                            Unit unit = Unit.a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        mVar2.w.a((y) i.a);
                    } catch (IOException e2) {
                        un.b bVar = un.b.d;
                        mVar2.a(bVar, bVar, e2);
                    }
                    Unit unit2 = Unit.a;
                    break;
                }
                if (uVarArr != null) {
                    for (u uVar2 : uVarArr) {
                        synchronized (uVar2) {
                            uVar2.e += jA;
                            if (jA > 0) {
                                uVar2.notifyAll();
                            }
                            Unit unit3 = Unit.a;
                        }
                    }
                }
                return Unit.a;
            case 9:
                un.m mVar3 = (un.m) this.b;
                mVar3.a.a(mVar3, (y) ((I) this.c).a);
                return Unit.a;
            case 10:
                A0 a0 = (A0) this.b;
                List list = (List) this.c;
                w.j jVar = a0.m;
                J.g gVar = z0.a;
                Intrinsics.checkNotNullParameter(jVar, "characteristicsCompat");
                Intrinsics.checkNotNullParameter(list, "surfaceConfigs");
                if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) jVar.a(y0.a())) != null && jArr.length != 0) {
                    HashSet hashSet = new HashSet();
                    for (long j : jArr) {
                        hashSet.add(Long.valueOf(j));
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                        } else if (!hashSet.contains(Long.valueOf(((M0) it.next()).c.a))) {
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                P1.f0 f0Var = (P1.f0) this.c;
                C3695k0 c3695k05 = (C3695k0) this.b;
                String strO = f0Var.o();
                String str2 = c3695k05.a.a;
                int i2 = c3695k05.c;
                StringBuilder sbL = A8.b.l("checkContinue: resumeChat chatId=", strO, ", messageId=", str2, ", eventOffset=");
                sbL.append(i2);
                return sbL.toString();
            case 12:
                return z.g("chatMessageEvents skipped (isAlive=false): chatId=", ((P1.f0) this.b).o(), ", eventRoomId=", ((C2105w) this.c).g);
            case 13:
                return z.g("handleStream error: ", ((Throwable) this.b).getMessage(), ", chatId=", ((P1.f0) this.c).o());
            case 14:
                return (a2) ((C0964a) this.b).f.get((String) this.c);
            case 15:
                z3 z3Var = (z3) this.b;
                Function1 function1 = (Function1) this.c;
                z3Var.a();
                function1.invoke(new O2(3));
                return Unit.a;
            case 16:
                return "retry: tries=" + ((G) this.b).a + ", result=" + this.c;
            case 17:
                H h = (H) this.b;
                w0.w wVar = (w0.w) this.c;
                w0.f fVar = (w0.f) h.getValue();
                return new w0.g(wVar, fVar, new C7.a((IntRange) wVar.d.f.getValue(), fVar));
            case 18:
                return kotlin.collections.y.c(new Pair((B8.g) this.b, (nl.d) this.c));
            case 19:
                l0 l0Var = (l0) this.b;
                C0157y c0157y = (C0157y) this.c;
                C5 c5 = c0157y.b;
                C5404s0 c5404s0 = c0157y.c;
                B2 b2 = c0157y.d;
                m3.a aVarI = Z.i(l0Var);
                KimiApplication kimiApplication = B.a;
                Tm.e eVar2 = P.a;
                E.z(aVarI, Tm.d.c, (C) null, new C5538m(c5404s0, c5, b2, l0Var, null), 2);
                return Unit.a;
            case 20:
                return "click phone, context: " + ((Context) this.b) + ", view: " + ((View) this.c);
            case 21:
                return Boolean.valueOf(!Intrinsics.b((C3123f) this.b, (C3123f) ((f0) this.c).getValue()));
            case 22:
                return new x0.f0((l1.f) this.b, kotlin.collections.P.d(), (l1.b) this.c);
            case 23:
                B2 b22 = (B2) this.b;
                C5607W c5607w = (C5607W) this.c;
                if (!b22.b().f().b) {
                    C5617j c5617j = c5607w.j;
                    String str3 = b22.b().a;
                    c5617j.getClass();
                    Intrinsics.checkNotNullParameter(str3, "<set-?>");
                    c5617j.q.setValue(str3);
                }
                return Unit.a;
            case 24:
                H h2 = (H) this.b;
                y0.w wVar2 = (y0.w) this.c;
                y0.d dVar = (y0.d) h2.getValue();
                return new y0.e(wVar2, dVar, new C7.a((IntRange) ((x0.N) wVar2.c.h).getValue(), dVar));
            case 25:
                r rVar = (r) this.b;
                UUID uuid = (UUID) this.c;
                WorkDatabase workDatabase = rVar.c;
                Intrinsics.checkNotNullExpressionValue(workDatabase, "getWorkDatabase(...)");
                y3.i iVar = new y3.i(3, rVar, uuid);
                workDatabase.getClass();
                Intrinsics.checkNotNullParameter(iVar, "body");
                workDatabase.p(new C1206x4(10, iVar));
                q5.h.b(rVar.b, rVar.c, rVar.e);
                return Unit.a;
            case 26:
                return "onEvent_success: event=" + ((String) this.b) + ", params=" + ((LinkedHashMap) this.c);
            case 27:
                return z.g("MainPages.MainRoute ", (String) this.b, " : ", ((C3049t0) this.c).c);
            case 28:
                Function0 function0 = (Function0) this.b;
                e0 e0Var = (e0) this.c;
                KimiApplication kimiApplication2 = B.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - e0Var.a() >= 300) {
                    function0.invoke();
                    e0Var.l(jCurrentTimeMillis);
                }
                return Unit.a;
            default:
                Q q = (Q) this.b;
                C4816f c4816f = (C4816f) this.c;
                Jc.b bVar2 = t.a;
                Zf.j jVar2 = new Zf.j();
                jVar2.t("moment_id", c4816f.h.b);
                B2 b23 = c4816f.h;
                jVar2.n(b23.b().d().h.e(), "moment_type");
                Unit unit4 = Unit.a;
                t.f("discovery", jVar2.toString());
                String str4 = Hg.a.b;
                String str5 = q.d;
                String str6 = c4816f.e;
                Intrinsics.checkNotNullParameter(str5, "fromPage");
                Intrinsics.checkNotNullParameter(str6, "chatId");
                Intrinsics.checkNotNullParameter(b23, "moment");
                KimiApplication kimiApplication3 = B.a;
                Hg.a.a = System.currentTimeMillis();
                Hg.a.b = str5;
                Hg.a.c = str6;
                Hg.a.d = b23;
                Hg.f fVar2 = Hg.f.a;
                Zf.j jVarB = s3.e.b("from_page", str5);
                jVarB.n(s3.e.m(jVarB, "from_moment_id", b23.b, b23).h.e(), "from_moment_type");
                jVarB.t("chat_id", str6);
                Hg.f.k(fVar2, "chat_detail_from_moment_page_view", "chat_detail", "page_view", null, null, null, jVarB, 0L, b23, 184);
                Be.e.n(c4816f.g, false, null, false, null, null, 62);
                return Unit.a;
        }
    }

    public /* synthetic */ C4791b(Object obj, C3695k0 c3695k0, int i) {
        this.a = i;
        this.c = obj;
        this.b = c3695k0;
    }
}
