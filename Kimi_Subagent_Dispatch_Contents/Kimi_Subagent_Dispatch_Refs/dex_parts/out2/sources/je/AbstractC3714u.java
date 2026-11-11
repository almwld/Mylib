package je;

import Dc.C0486d7;
import Dc.C0568n;
import bc.C2424a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: je.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class AbstractC3714u {
    public static final Set a = kotlin.collections.Y.b(Ec.h0.d);
    public static final Set b;

    static {
        C2424a c2424a = Zd.B.b;
        b = kotlin.collections.Y.b("generate_slides_outline");
    }

    public static final void a(kotlin.jvm.internal.I i, kotlin.jvm.internal.I i2, ArrayList arrayList) {
        Object obj;
        if (!((Collection) i.a).isEmpty() && (obj = i2.a) != null) {
            arrayList.add(new C3708r((EnumC3710s) obj, CollectionsKt.B0((Iterable) i.a)));
        }
        i.a = new ArrayList();
    }

    public static final boolean b(C0568n c0568n) {
        Intrinsics.checkNotNullParameter(c0568n, "<this>");
        if (!c0568n.i()) {
            return false;
        }
        C2424a c2424a = Zd.B.b;
        String str = c0568n.p().b;
        c2424a.getClass();
        if (C2424a.k(str) != Zd.B.Q) {
            return false;
        }
        List list = c0568n.p().r;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0486d7) it.next()).c().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final C3712t c(C0568n c0568n, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
        String str = c0568n.a;
        if (linkedHashSet.contains(str)) {
            return new C3712t(c0568n, kotlin.collections.I.a);
        }
        linkedHashSet.add(str);
        kotlin.collections.I i = (List) linkedHashMap.get(str);
        if (i == null) {
            i = kotlin.collections.I.a;
        }
        List list = (Iterable) i;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list instanceof Collection ? list.size() : 10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((C0568n) it.next(), linkedHashMap, linkedHashSet));
        }
        return new C3712t(c0568n, arrayList);
    }
}
