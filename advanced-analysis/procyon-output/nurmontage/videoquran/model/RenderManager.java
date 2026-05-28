// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.model;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class RenderManager
{
    private int currentTaskIndex;
    private float globalProgress;
    private final List tasks;
    
    public RenderManager() {
        this.tasks = new ArrayList();
        this.currentTaskIndex = 0;
        this.globalProgress = 0.0f;
    }
    
    public void addTask(final String name, final int expectedDuration) {
        final RenderTask renderTask = new RenderTask();
        renderTask.name = name;
        renderTask.expectedDuration = expectedDuration;
        this.tasks.add(0, renderTask);
    }
    
    public void computeWeights() {
        final Iterator iterator = this.tasks.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((RenderTask)iterator.next()).expectedDuration;
        }
        for (final RenderTask renderTask : this.tasks) {
            renderTask.weight = renderTask.expectedDuration / (float)n;
        }
    }
    
    public int getCurrentStepDuration() {
        return this.tasks.get(this.currentTaskIndex).expectedDuration;
    }
    
    public void nextTask() {
        if (this.currentTaskIndex < this.tasks.size() - 1) {
            ++this.currentTaskIndex;
        }
    }
    
    public float updateLocalProgress(float globalProgress) {
        float n = 0.0f;
        int n2 = 0;
        int currentTaskIndex;
        while (true) {
            currentTaskIndex = this.currentTaskIndex;
            if (n2 >= currentTaskIndex) {
                break;
            }
            n += ((RenderTask)this.tasks.get(n2)).weight;
            ++n2;
        }
        globalProgress *= ((RenderTask)this.tasks.get(currentTaskIndex)).weight;
        final float globalProgress2 = n + globalProgress;
        this.globalProgress = globalProgress2;
        globalProgress = 1.0f;
        if (globalProgress2 > globalProgress) {
            this.globalProgress = globalProgress;
        }
        return this.globalProgress;
    }
}
