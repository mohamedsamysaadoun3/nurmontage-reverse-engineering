/*
 * Decompiled with CFR 0.152.
 */
package hazem.nurmontage.videoquran.model;

import hazem.nurmontage.videoquran.model.RenderTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RenderManager {
    private int currentTaskIndex;
    private float globalProgress;
    private final List tasks;

    public RenderManager() {
        ArrayList arrayList;
        this.tasks = arrayList = new ArrayList();
        this.currentTaskIndex = 0;
        this.globalProgress = 0.0f;
    }

    public void addTask(String string2, int n) {
        RenderTask renderTask = new RenderTask();
        renderTask.name = string2;
        renderTask.expectedDuration = n;
        this.tasks.add(0, renderTask);
    }

    public void computeWeights() {
        RenderTask renderTask;
        int n;
        Iterator iterator = this.tasks.iterator();
        int n2 = 0;
        while ((n = iterator.hasNext()) != 0) {
            renderTask = (RenderTask)iterator.next();
            n = renderTask.expectedDuration;
            n2 += n;
        }
        iterator = this.tasks.iterator();
        while ((n = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            renderTask = (RenderTask)iterator.next();
            int n3 = renderTask.expectedDuration;
            float f = n3;
            float f2 = n2;
            renderTask.weight = f /= f2;
        }
    }

    public int getCurrentStepDuration() {
        List list = this.tasks;
        int n = this.currentTaskIndex;
        return ((RenderTask)list.get((int)n)).expectedDuration;
    }

    public void nextTask() {
        int n = this.currentTaskIndex;
        List list = this.tasks;
        int n2 = list.size() + -1;
        if (n < n2) {
            this.currentTaskIndex = n = this.currentTaskIndex + 1;
        }
    }

    public float updateLocalProgress(float f) {
        int n;
        int n2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RenderTask renderTask = null;
        for (int i = 0; i < (n = this.currentTaskIndex); ++i) {
            RenderTask renderTask2 = (RenderTask)this.tasks.get(i);
            float f4 = renderTask2.weight;
            f2 += f4;
        }
        renderTask = (RenderTask)this.tasks.get(n);
        f3 = renderTask.weight;
        this.globalProgress = f2 += (f *= f3);
        f = 1.0f;
        float f5 = f2 - f;
        n2 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
        if (n2 > 0) {
            this.globalProgress = f;
        }
        return this.globalProgress;
    }
}

