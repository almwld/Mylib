package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public class Y {
    public static Tk.l a(Tk.l builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tk.h hVar = builder.a;
        hVar.c();
        return hVar.i > 0 ? builder : Tk.l.c;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
