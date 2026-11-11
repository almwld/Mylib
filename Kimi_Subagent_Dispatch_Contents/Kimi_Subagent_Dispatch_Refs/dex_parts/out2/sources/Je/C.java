package Je;

import Ad.V;
import Dc.C0568n;
import Ie.S0;
import bc.C2424a;
import c1.f0;
import dg.C2978a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.C1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ub.AbstractC4646k5;
import vb.N2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C extends Xk.i implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(ArrayList arrayList, f0 f0Var, Vk.a aVar) {
        super(2, aVar);
        this.a = arrayList;
        this.b = f0Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C(this.a, this.b, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.a) {
            C0568n c0568n = (C0568n) obj2;
            C2424a c2424a = Zd.B.b;
            String str = c0568n.p().b;
            c2424a.getClass();
            Zd.B bK = C2424a.k(str);
            if (bK == Zd.B.X || bK == Zd.B.Y) {
                if (!c0568n.p().d) {
                    arrayList.add(obj2);
                }
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "blocks");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object objA = null;
            if (!it.hasNext()) {
                break;
            }
            C0568n c0568n2 = (C0568n) it.next();
            Zf.f fVar = Zf.f.a;
            String str2 = c0568n2.p().c;
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        kn.t tVar = Zf.f.c;
                        tVar.getClass();
                        objA = tVar.a(N2.j(C1.Companion.serializer()), str2);
                    }
                } catch (Throwable th2) {
                    boolean z = C2978a.a;
                    C2978a.b("KimiJson", null, new V(14, str2, th2));
                }
            }
            C1 c1 = (C1) objA;
            if (c1 != null) {
                String str3 = c1.A;
                String str4 = c1.k;
                if (str4.length() == 0) {
                    str4 = str3;
                }
                boolean z2 = c1.l;
                String strK = AbstractC4646k5.k(c0568n2.p());
                if (str4.length() > 0 && strK.length() > 0) {
                    arrayList2.add(new S0(strK, str4, StringsKt.r0('/', str4, str3), z2));
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            String str5 = ((S0) obj3).b;
            Object arrayList3 = linkedHashMap.get(str5);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str5, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (!((S0) next).d) {
                    break;
                }
            }
            S0 s0 = (S0) next;
            if (s0 == null) {
                s0 = (S0) CollectionsKt.U(list);
            }
            arrayList4.add(s0);
        }
        this.b.setValue(arrayList4);
        return Unit.a;
    }
}
