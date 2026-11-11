package ue;

import Dc.C0639v;
import Fh.O0;
import Mm.E;
import Sk.r;
import Sk.t;
import dg.C2978a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qg.v;
import tf.C4503a;
import th.C4529a;
import ye.C5726a;
import ye.C5729d;
import ze.b0;

/* JADX INFO: renamed from: ue.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class AbstractC4797h {
    public static final v a = new v(new C4503a(24));

    public static C4801l a(C0639v c0639v, Function2 function2) {
        return new C4801l(c0639v, null, null, z.m(new b0[]{new C5729d(0), new C5726a(3), new C5726a(0), new C5729d(1), new C5726a(2), new C5726a(1), new ye.i(), new C4795f()}), function2, 14);
    }

    public static void b(C4801l c4801l) {
        jk.d dVar;
        Intrinsics.checkNotNullParameter(c4801l, "service");
        C4801l c4801l2 = c4801l instanceof C4801l ? c4801l : null;
        if (!a.b.remove(c4801l) || c4801l2 == null || (dVar = c4801l2.e) == null) {
            return;
        }
        E.h(dVar, (CancellationException) null);
    }

    public static int c(String str) {
        Unit unitE;
        Intrinsics.checkNotNullParameter(str, "reason");
        v vVar = a;
        int size = vVar.b.size();
        List listB0 = CollectionsKt.B0(vVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB0) {
            if (obj instanceof C4801l) {
                arrayList.add(obj);
            }
        }
        ArrayList<C4801l> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((C4801l) obj2).p) {
                arrayList2.add(obj2);
            }
        }
        for (C4801l c4801l : arrayList2) {
            try {
                r rVar = t.b;
                b(c4801l);
                unitE = Unit.a;
            } catch (Throwable th2) {
                r rVar2 = t.b;
                unitE = P8.a.e(th2);
            }
            Throwable thA = t.a(unitE);
            if (thA != null) {
                boolean z = C2978a.a;
                C2978a.b("StreamServiceFactory", thA, new C4529a(6));
            }
        }
        C2978a.c("StreamServiceFactory", new O0(str, size, arrayList2));
        return arrayList2.size();
    }
}
