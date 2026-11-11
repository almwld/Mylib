package Dc;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Dc.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class C0683z7 {

    @NotNull
    public static final C0674y7 Companion = new C0674y7();
    public static final Sk.l[] c = {null, Sk.m.a(Sk.n.b, new P5(13))};
    public static final C0683z7 d = new C0683z7(BuildConfig.FLAVOR, kotlin.collections.I.a);
    public final String a;
    public final List b;

    public C0683z7(String str, List list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "workers");
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0683z7)) {
            return false;
        }
        C0683z7 c0683z7 = (C0683z7) obj;
        return Intrinsics.b(this.a, c0683z7.a) && Intrinsics.b(this.b, c0683z7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return S0.b.n("ToolMetaCreateSubagent(name=", this.a, ", workers=", ")", this.b);
    }

    public C0683z7(String str, List list, int i) {
        this.a = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.I.a;
        } else {
            this.b = list;
        }
    }
}
