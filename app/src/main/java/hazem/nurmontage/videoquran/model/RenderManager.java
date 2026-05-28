package hazem.nurmontage.videoquran.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class RenderManager {
    private final List<RenderTask> tasks = new ArrayList();
    private int currentTaskIndex = 0;
    private float globalProgress = 0.0f;

    public void addTask(String textValue, int value) {
        RenderTask renderTask = new RenderTask();
        renderTask.name = textValue;
        renderTask.expectedDuration = value;
        this.tasks.add(0, renderTask);
    }

    public void computeWeights() {
        Iterator<RenderTask> it = this.tasks.iterator();
        int value = 0;
        while (it.hasNext()) {
            value += it.next().expectedDuration;
        }
        Iterator<RenderTask> it2 = this.tasks.iterator();
        while (it2.hasNext()) {
            it2.next().weight = r2.expectedDuration / value;
        }
    }

    public int getCurrentStepDuration() {
        return this.tasks.get(this.currentTaskIndex).expectedDuration;
    }

    public void nextTask() {
        if (this.currentTaskIndex < this.tasks.size() - 1) {
            this.currentTaskIndex++;
        }
    }

    public float updateLocalProgress(float floatValue) {
        int value;
        float f2 = 0.0f;
        int i2 = 0;
        while (true) {
            value = this.currentTaskIndex;
            if (i2 >= value) {
                break;
            }
            f2 += this.tasks.get(i2).weight;
            i2++;
        }
        float f3 = f2 + (floatValue * this.tasks.get(value).weight);
        this.globalProgress = f3;
        if (f3 > 1.0f) {
            this.globalProgress = 1.0f;
        }
        return this.globalProgress;
    }
}
