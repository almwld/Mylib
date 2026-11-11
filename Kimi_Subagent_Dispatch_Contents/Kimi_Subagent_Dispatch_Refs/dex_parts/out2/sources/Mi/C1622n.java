package Mi;

import Dc.C0486d7;
import Dc.C0568n;
import Hf.R4;
import Jg.C1350o;
import Oh.C1806t;
import Vc.C2168x0;
import Vc.D0;
import android.content.res.Resources;
import bc.C2424a;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import dg.C2978a;
import eg.C3109Q;
import eg.EnumC3133p;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import je.C3695k0;
import je.F1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.C4068d;
import vb.N2;
import xc.C5571b;

/* JADX INFO: renamed from: Mi.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C1622n extends kotlin.jvm.internal.o implements gl.l {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1622n(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objPrevious;
        Object next;
        Object objA;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Vk.a aVar = (Vk.a) obj3;
                ((C1628u) ((kotlin.jvm.internal.e) this).receiver).getClass();
                Jc.b bVar = bh.t.a;
                String str2 = ((bh.x) bh.t.c(str).getValue()).a;
                kotlin.jvm.internal.I i = new kotlin.jvm.internal.I();
                i.a = BuildConfig.FLAVOR;
                Iterator it = CollectionsKt.s0((List) obj2, new C1627t()).iterator();
                while (it.hasNext()) {
                    List list = ((C3695k0) it.next()).a.m;
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            C0568n c0568n = (C0568n) objPrevious;
                            if (!c0568n.p().d) {
                                C2424a c2424a = Zd.B.b;
                                String str3 = c0568n.p().b;
                                c2424a.getClass();
                                if (C2424a.k(str3) != Zd.B.P || c0568n.p().r.isEmpty()) {
                                }
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    C0568n c0568n2 = (C0568n) objPrevious;
                    if (c0568n2 != null) {
                        Zf.f fVar = Zf.f.a;
                        Iterator it2 = c0568n2.p().r.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((C0486d7) next).c().length() > 0) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        C0486d7 c0486d7 = (C0486d7) next;
                        String strC = c0486d7 != null ? c0486d7.c() : BuildConfig.FLAVOR;
                        try {
                        } catch (Throwable th2) {
                            boolean z = C2978a.a;
                            s3.e.v(strC, th2, "KimiJson", (Throwable) null);
                        }
                        if (strC.length() == 0) {
                            objA = null;
                        } else {
                            kn.t tVar = Zf.f.c;
                            tVar.getClass();
                            objA = tVar.a(N2.j(F1.Companion.serializer()), strC);
                        }
                        F1 f1 = (F1) objA;
                        C2978a.c("ChatShare", new C1350o(str2, i, f1, 8));
                        if (((CharSequence) i.a).length() == 0 || !Intrinsics.b(i.a, str2)) {
                            String str4 = f1 != null ? f1.d : null;
                            if (str4 == null) {
                                str4 = BuildConfig.FLAVOR;
                            }
                            i.a = str4;
                        }
                        break;
                    }
                }
                C2978a.c("ChatShare", new R4(i, str2, 1));
                if (((CharSequence) i.a).length() <= 0 || Intrinsics.b(str2, i.a)) {
                    return Unit.a;
                }
                C5571b c5571b = C5571b.b;
                Intrinsics.checkNotNullParameter(c5571b, "client");
                D0 d0 = new D0(str, (String) i.a);
                C3109Q c3109q = C3109Q.a;
                qk.i iVar = C3109Q.h() ? C3109Q.e : C3109Q.c;
                long j = c5571b.a.a;
                EnumC3133p enumC3133p = EnumC3133p.a;
                qk.M.c.getClass();
                qk.s sVar = qk.L.b;
                Bk.q.a.getClass();
                Object objI = Mm.E.I(Mm.P.a, new C2168x0(qk.E.c, Bk.p.b, d0, iVar, j, sVar, null), aVar);
                return objI == Wk.a.a ? objI : Unit.a;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                Hf.M m = ((C1806t) ((kotlin.jvm.internal.e) this).receiver).p;
                C4068d c4068d = m.g;
                C4068d c4068d2 = (C4068d) m.i;
                C4068d c4068d3 = m.h;
                if (((Number) c4068d.a.getValue()).intValue() != iIntValue) {
                    m.g.setValue(Integer.valueOf(iIntValue));
                }
                if (((Number) c4068d3.a.getValue()).intValue() != iIntValue2 || ((Number) c4068d2.a.getValue()).intValue() != iIntValue3) {
                    c4068d3.setValue(Integer.valueOf(iIntValue2));
                    c4068d2.setValue(Integer.valueOf(iIntValue3));
                }
                return Unit.a;
            case 2:
                Function1 function1 = ((Om.g) ((kotlin.jvm.internal.e) this).receiver).b;
                Intrinsics.d(function1);
                Rm.b.a(function1, obj2, (CoroutineContext) obj3);
                return Unit.a;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                Object obj4 = ((Om.o) obj2).a;
                Function1 function12 = ((Om.g) ((kotlin.jvm.internal.e) this).receiver).b;
                Intrinsics.d(function12);
                Object objA2 = Om.o.a(obj4);
                Intrinsics.d(objA2);
                Rm.b.a(function12, objA2, (CoroutineContext) obj3);
                return Unit.a;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                Q1.w wVar = (Q1.w) ((kotlin.jvm.internal.e) this).receiver;
                Resources resources = wVar.getContext().getResources();
                return Boolean.valueOf(Q1.H.a.a(wVar, (s1.h) null, new s1.b(new n2.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((v1.e) obj2).a, (Function1) obj3)));
        }
    }
}
