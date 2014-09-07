/*
 * Copyright 2010 The Rabbit Eclipse Plug-in Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package rabbit.ui.internal.viewers;

import rabbit.ui.internal.util.ActivitySessionName;
import rabbit.ui.internal.util.LaunchName;
import static org.eclipse.debug.core.ILaunchManager.DEBUG_MODE;
import static org.eclipse.debug.core.ILaunchManager.RUN_MODE;
import static org.eclipse.debug.ui.IDebugUIConstants.IMG_OBJS_ENVIRONMENT;
import static org.eclipse.debug.ui.IDebugUIConstants.IMG_OBJS_LAUNCH_DEBUG;
import static org.eclipse.debug.ui.IDebugUIConstants.IMG_OBJS_LAUNCH_RUN;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

/**
 * Label provider for launches.
 */
public final class ActivityLabelProvider extends NullLabelProvider {

  private final Color gray;

  public ActivityLabelProvider() {
	gray = PlatformUI.getWorkbench().getDisplay()
	          .getSystemColor(SWT.COLOR_DARK_GRAY);
  }

  @Override
  public Color getForeground(Object element) {
    if (element == null) {
      return gray;
    } else if (!(element instanceof ActivitySessionName)) {
      return gray;
    }
    return super.getForeground(element);
  }

  @Override
  public Image getImage(Object element) {
    return super.getImage(element);
  }

  @Override
  public String getText(Object element) {
    if (element instanceof ActivitySessionName) {
      return ((ActivitySessionName) element).getActivitySessionName();
    }
    return super.getText(element);
  }
}
